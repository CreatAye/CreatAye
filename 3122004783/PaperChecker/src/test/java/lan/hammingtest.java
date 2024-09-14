package lan;

import lan.util.txtio;
import lan.util.hammingutil;
import lan.util.simhash;
import org.junit.Test;

public class hammingtest {
    public hammingtest() {
    }

    @Test
    public void getHammingDistanceTest() {
        String str0 = txtio.readTxt("C:/Users/Lan/Desktop/test/orig.txt");
        String str1 = txtio.readTxt("C:/Users/Lan/Desktop/test/orig_0.8_add.txt");
        int distance = hammingutil.getHammingDistance(simhash.getSimHash(str0), simhash.getSimHash(str1));
        System.out.println("海明距离：" + distance);
        System.out.println("相似度: " + (100 - distance * 100 / 128) + "%");
    }

    @Test
    public void getHammingDistanceFailTest() {
        String str0 = "10101010";
        String str1 = "1010101";
        System.out.println(hammingutil.getHammingDistance(str0, str1));
    }

    @Test
    public void getSimilarityTest() {
        String str0 = txtio.readTxt("C:/Users/Lan/Desktop/test/orig.txt");
        String str1 = txtio.readTxt("C:/Users/Lan/Desktop/test/orig_0.8_add.txt");
        int distance = hammingutil.getHammingDistance(simhash.getSimHash(str0), simhash.getSimHash(str1));
        double similarity = hammingutil.getSimilarity(simhash.getSimHash(str0), simhash.getSimHash(str1));
        System.out.println("str0和str1的汉明距离: " + distance);
        System.out.println("str0和str1的相似度:" + similarity);
    }
}
