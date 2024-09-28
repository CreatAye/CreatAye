package lan;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class IOUtil {
    // 写入文件换行
    public static void writeToFile(String filePath, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath,true))) {
            writer.write(content);
            writer.newLine();
            //System.out.println("数据已成功写入文件。");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //写入文件追加
    public static void writeToFileAppend(String filePath, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath,true))) {
            writer.write(content);
            //System.out.println("数据已成功写入文件。");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // 读取文件的方法
    public static void readFromFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            System.out.println(filePath+"文件内容：");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //清空文件
    public static void clearFile(String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            //不写入相当于清空文件
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        /*String filePath = "example.txt"; // 文件名
        String contentToWrite = "Hello, this is a sample text for the file.\nThis is the second line.";
        // 写入文件
        writeToFile(filePath, contentToWrite);
        // 读取文件
        readFromFile(filePath);*/

        /*if (found) {
            System.out.println("字符串 \"" + searchString + "\" 在文件中找到了。");
        } else {
            System.out.println("字符串 \"" + searchString + "\" 在文件中未找到。");
        }*/
    }
}
