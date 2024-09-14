package lan;

import lan.util.hammingutil;
import lan.util.simhash;
import lan.util.txtio;
import org.junit.Test;

public class maintest {
    public maintest() {
    }

    @Test
    public void origAndAllTest() {
        String[] str = new String[]{txtio.readTxt("C:/Users/Lan/Desktop/test/orig.txt"), txtio.readTxt("C:/Users/Lan/Desktop/test/orig_0.8_add.txt"), txtio.readTxt("C:/Users/Lan/Desktop/test/orig_0.8_del.txt"), txtio.readTxt("C:/Users/Lan/Desktop/test/orig_0.8_dis_1.txt"), txtio.readTxt("C:/Users/Lan/Desktop/test/orig_0.8_dis_10.txt"), txtio.readTxt("C:/Users/Lan/Desktop/test/orig_0.8_dis_15.txt")};
        String ansFileName = "C:/Users/Lan/Desktop/test/result.txt";

        for(int i = 0; i <= 5; ++i) {
            double ans = hammingutil.getSimilarity(simhash.getSimHash(str[0]), simhash.getSimHash(str[i]));
            txtio.writeTxt(ans, ansFileName);
        }

    }

    @Test
    public void origAndOrigTest() {
        String str0 = txtio.readTxt("C:/Users/Lan/Desktop/test/orig.txt");
        String str1 = txtio.readTxt("C:/Users/Lan/Desktop/test/orig.txt");
        String ansFileName = "C:/Users/Lan/Desktop/test/result.txt";
        double ans = hammingutil.getSimilarity(simhash.getSimHash(str0), simhash.getSimHash(str1));
        txtio.writeTxt(ans, ansFileName);
    }

    @Test
    public void origAndAddTest() {
        String str0 = txtio.readTxt("C:/Users/Lan/Desktop/test/orig.txt");
        String str1 = txtio.readTxt("C:/Users/Lan/Desktop/test/orig_0.8_add.txt");
        String ansFileName = "C:/Users/Lan/Desktop/test/orig_0.8_add.txt";
        double ans = hammingutil.getSimilarity(simhash.getSimHash(str0), simhash.getSimHash(str1));
        txtio.writeTxt(ans, ansFileName);
    }

    @Test
    public void origAndDelTest() {
        String str0 = txtio.readTxt("C:/Users/Lan/Desktop/test/orig.txt");
        String str1 = txtio.readTxt("C:/Users/Lan/Desktop/test/orig_0.8_del.txt");
        String ansFileName = "C:/Users/Lan/Desktop/test/result.txt";
        double ans = hammingutil.getSimilarity(simhash.getSimHash(str0), simhash.getSimHash(str1));
        txtio.writeTxt(ans, ansFileName);
    }

    @Test
    public void origAndDisTest() {
        String str0 = txtio.readTxt("C:/Users/Lan/Desktop/test/orig.txt");
        String str1 = txtio.readTxt("C:/Users/Lan/Desktop/test/orig_0.8_dis_1.txt");
        String ansFileName = "C:/Users/Lan/Desktop/test/result.txt";
        double ans = hammingutil.getSimilarity(simhash.getSimHash(str0), simhash.getSimHash(str1));
        txtio.writeTxt(ans, ansFileName);
    }

    @Test
    public void origAndDis10Test() {
        String str0 = txtio.readTxt("C:/Users/Lan/Desktop/test/orig.txt");
        String str1 = txtio.readTxt("C:/Users/Lan/Desktop/test/orig_0.8_dis_10.txt");
        String ansFileName = "C:/Users/Lan/Desktop/test/result.txt";
        double ans = hammingutil.getSimilarity(simhash.getSimHash(str0), simhash.getSimHash(str1));
        txtio.writeTxt(ans, ansFileName);
    }

    @Test
    public void origAndAddDia15Test() {
        String str0 = txtio.readTxt("C:/Users/Lan/Desktop/test/orig.txt");
        String str1 = txtio.readTxt("C:/Users/Lan/Desktop/test/orig_0.8_dis_15.txt");
        String ansFileName = "C:/Users/Lan/Desktop/test/result.txt";
        double ans = hammingutil.getSimilarity(simhash.getSimHash(str0), simhash.getSimHash(str1));
        txtio.writeTxt(ans, ansFileName);
    }
}