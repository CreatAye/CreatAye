package lan.util;

import com.hankcs.hanlp.HanLP;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.List;

public class simhash {
    public simhash() {
    }

    public static String getHash(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            return (new BigInteger(1, messageDigest.digest(str.getBytes("UTF-8")))).toString(2);
        } catch (Exception var2) {
            var2.printStackTrace();
            return str;
        }
    }

    public static String getSimHash(String str) {
        try {
            // 检查输入字符串的长度是否小于200，如果是，则抛出异常
            if (str.length() < 200) {
                throw new ShortStringException("文本过短！");
            }
        } catch (ShortStringException e) {
            // 捕获到自定义异常时，打印异常栈追踪并返回null
            e.printStackTrace();
            return null;
        }

        // 初始化128维度的数组v，用于存储特征向量的每一维
        int[] v = new int[128];

        // 使用HanLP提取文本中的关键词
        List<String> keywordList = HanLP.extractKeyword(str, str.length());
        int size = keywordList.size();

        // 如果关键词列表为空，直接返回null以避免后续计算中的问题
        if (size == 0) return null;

        // 使用StringBuilder来高效地构建最终的SimHash值
        StringBuilder simHash = new StringBuilder();

        // 遍历每一个关键词
        for (int i = 0; i < size; i++) {
            // 获取当前关键词
            String keyword = keywordList.get(i);
            // 计算关键词的哈希值
            String keywordHash = getHash(keyword);

            // 确保哈希值的长度至少为128位，不足的部分用'0'填充
            if (keywordHash.length() < 128) {
                keywordHash = String.format("%1$-" + 128 + "s", keywordHash).replace(' ', '0');
            }

            // 根据哈希值更新特征向量v
            for (int j = 0; j < v.length; j++) {
                // 计算权重值，避免除零异常
                int weight = 10 - i / (size / 10);
                // 如果哈希值当前位是'1'，则增加权重，否则减少权重
                v[j] += (keywordHash.charAt(j) == '1') ? weight : -weight;
            }
        }

        // 根据特征向量v生成最终的SimHash值
        for (int value : v) {
            simHash.append(value > 0 ? '1' : '0');
        }

        // 返回生成的SimHash值
        return simHash.toString();
    }
}
