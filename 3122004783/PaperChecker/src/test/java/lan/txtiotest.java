package lan;

import lan.util.*;
import java.io.*;
import java.nio.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class txtiotest {
    public txtiotest() {
    }

    @Test
    public void readTxtTest() {
        String str = txtio.readTxt("C:/Users/Lan/Desktop/test/orig.txt");
        String[] strings = str.split(" ");
        String[] var3 = strings;
        int var4 = strings.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            String string = var3[var5];
            System.out.println(string);
        }

    }

    @Test
    public void writeTxtTest() {
        double[] elem = new double[]{0.11, 0.22, 0.33, 0.44, 0.55};

        for(int i = 0; i < elem.length; ++i) {
            txtio.writeTxt(elem[i], "C:/Users/Lan/Desktop/test/ans.txt");
        }

    }

    @Test
    public void readTxtFailTest() {
        String str = txtio.readTxt("C:/Users/Lan/Desktop/test/none.txt");
    }

    @Test
    public void writeTxtFailTest() {
        double[] elem = new double[]{0.11, 0.22, 0.33, 0.44, 0.55};

        for(int i = 0; i < elem.length; ++i) {
            txtio.writeTxt(elem[i], "C:/Users/Lan/Desktop/test/ans.txt");
        }

    }
    @Test
    public void writeTxtDirectoryNotFoundTest() {
        String filePath = "C:/Users/Lan/Desktop/nonexistent_directory/ans.txt";
        txtio.writeTxt(1.23, filePath);
        // 检查是否写入了数据
        String result = txtio.readTxt(filePath);
        assertEquals("", result); // 假设目录不存在，因此不应写入任何内容
    }
    @Test
    public void readTxtEmptyFileTest() {
        String filePath = "C:/Users/Lan/Desktop/test/empty.txt";
        String result = txtio.readTxt(filePath);
        assertEquals("", result); // 空文件应返回空字符串
    }

    @Test
    public void writeTxtToEmptyFileTest() {
        String filePath = "C:/Users/Lan/Desktop/test/empty.txt";
        txtio.writeTxt(2.34, filePath);
        String result = txtio.readTxt(filePath);
        assertTrue(result.contains("2.34")); // 文件应包含 "2.34"
    }

}