package lan.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class txtio {
    public txtio() {
    }

    public static String readTxt(String txtPath) {
        String str = "";
        File file = new File(txtPath);
        FileInputStream fileInputStream = null;

        try {
            fileInputStream = new FileInputStream(file);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");

            String strLine;
            BufferedReader bufferedReader;
            for(bufferedReader = new BufferedReader(inputStreamReader); (strLine = bufferedReader.readLine()) != null; str = str + strLine) {
            }

            inputStreamReader.close();
            bufferedReader.close();
            fileInputStream.close();
        } catch (IOException var7) {
            var7.printStackTrace();
        }

        return str;
    }

    public static void writeTxt(double txtElem, String txtPath) {
        String str = Double.toString(txtElem);
        File file = new File(txtPath);
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(file, true);
            fileWriter.write(str, 0, str.length() > 3 ? 4 : str.length());
            fileWriter.write("\r\n");
            fileWriter.close();
        } catch (IOException var7) {
            var7.printStackTrace();
        }

    }
}
