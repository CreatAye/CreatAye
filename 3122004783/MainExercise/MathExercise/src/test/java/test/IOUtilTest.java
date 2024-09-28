package test;
import lan.*;
import java.io.*;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;
public class IOUtilTest {
    /*private static final String TEST_FILE_PATH = "testFile.txt";

    @Test
    public void testWriteToFile() throws IOException {
        String content = "Hello, World!";
        FileUtils.writeToFile(TEST_FILE_PATH, content);

        String fileContent = new String(Files.readAllBytes(Paths.get(TEST_FILE_PATH)));
        assertEquals(content + System.lineSeparator(), fileContent);
    }

    @Test
    public void testWriteToFileAppend() throws IOException {
        String initialContent = "Hello";
        FileUtils.writeToFile(TEST_FILE_PATH, initialContent);

        String appendedContent = " World!";
        FileUtils.writeToFileAppend(TEST_FILE_PATH, appendedContent);

        String fileContent = new String(Files.readAllBytes(Paths.get(TEST_FILE_PATH)));
        assertEquals(initialContent + System.lineSeparator() + appendedContent, fileContent.trim());
    }

    @Test
    public void testReadFromFile() throws IOException {
        String content = "Read this line.";
        FileUtils.writeToFile(TEST_FILE_PATH, content);

        // Capturing standard output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        FileUtils.readFromFile(TEST_FILE_PATH);

        String expectedOutput = TEST_FILE_PATH + "文件内容：\n" + content + "\n";
        assertEquals(expectedOutput, outContent.toString());

        // Reset the standard output
        System.setOut(System.out);
    }*/
}