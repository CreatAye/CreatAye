package lan.main;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
import lan.util.*;

public class mainpapercheck {
    public mainpapercheck() {
    }

    public static void main(String[] args) {
        /*String str0 = txtio.readTxt(args[0]);
        String str1 = txtio.readTxt(args[1]);
        String resultFileName = args[2];*/
        String str0 = txtio.readTxt("E:\\orig.txt");
        String str1 = txtio.readTxt("E:\\orig_0.8_add.txt");
        String resultFileName ="E:\\result.txt";
        String simHash0 = simhash.getSimHash(str0);
        String simHash1 = simhash.getSimHash(str1);
        double similarity = hammingutil.getSimilarity(simHash0, simHash1);
        txtio.writeTxt(similarity, resultFileName);
        System.exit(0);
    }
}