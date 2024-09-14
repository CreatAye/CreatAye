package lan.util;

public class hammingutil {

    // 默认构造函数
    public hammingutil() {
    }

    // 计算两个字符串的汉明距离
    public static int getHammingDistance(String simHash1, String simHash2) {
        int distance = 0;

        // 如果两个字符串长度不相等，返回-1
        if (simHash1.length() != simHash2.length()) {
            distance = -1;
        } else {
            // 遍历字符串，计算不同字符的数量
            for(int i = 0; i < simHash1.length(); ++i) {
                if (simHash1.charAt(i) != simHash2.charAt(i)) {
                    ++distance;
                }
            }
        }

        return distance;
    }

    // 计算两个字符串的相似度
    public static double getSimilarity(String simHash1, String simHash2) {
        // 获取汉明距离
        int distance = getHammingDistance(simHash1, simHash2);

        // 根据汉明距离计算相似度，假设最大长度为128
        return 0.01 * (double)(100 - distance * 100 / 128);
    }
}

