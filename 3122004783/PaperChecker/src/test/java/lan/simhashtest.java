package lan;
import lan.util.*;
import org.junit.Test;
import static org.junit.Assert.assertNull;

public class simhashtest {
    public simhashtest() {
    }
    @Test
    public void testShortStringException() {
        // 输入长度小于200的字符串
        String shortString = "这是一个测试字符串，长度小于200";

        // 测试是否抛出ShortStringException，并检查返回值是否为null
        String result = new simhash().getSimHash(shortString);

        // 确保返回值为null
        assertNull(result, "Expected null for strings shorter than 200 characters.");
    }

    @Test
    public void getHashTest() {
        String[] strings = new String[]{"与", "世上", "众人", "的", "路径", "相反"};
        String[] var2 = strings;
        int var3 = strings.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            String string = var2[var4];
            String stringHash = simhash.getHash(string);
            System.out.println(stringHash.length());
            System.out.println(stringHash);
        }

    }

    @Test
    public void getSimHashTest() {
        String str0 = txtio.readTxt("C:/Users/Lan/Desktop/test/orig.txt");
        String str1 = txtio.readTxt("C:/Users/Lan/Desktop/test/orig_0.8_add.txt");
        System.out.println(simhash.getSimHash(str0));
        System.out.println(simhash.getSimHash(str1));
    }
}
