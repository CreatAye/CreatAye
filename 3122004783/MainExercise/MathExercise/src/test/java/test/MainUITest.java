package test;
import lan.*;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.Test;

public class MainUITest {

    /*private final String exercisesFile = "Exercises.txt";
    private final String answersFile = "Answers.txt";
    private final String gradeFile = "Grade.txt";


    @Test
    public void testCreatFormula() {
        // 测试 creatFormula 方法
        MainUI.creatFormula(100, 10); // 创建 10 道题目

        // 验证 Exercises.txt 和 Answers.txt 文件是否生成并且内容正确
        assertTrue(new File(exercisesFile).exists(), "Exercises.txt 文件未创建");
        assertTrue(new File(answersFile).exists(), "Answers.txt 文件未创建");

        // 验证文件行数
        long exerciseLines = countLines(exercisesFile);
        long answerLines = countLines(answersFile);
        assertEquals(10, exerciseLines, "Exercises.txt 的行数不正确");
        assertEquals(10, answerLines, "Answers.txt 的行数不正确");
    }

    @Test
    public void testCheckFormula() throws IOException {
        // 测试 checkFormula 方法
        MainUI.creatFormula(100, 10);

        // 模拟用户答案
        IOUtil.writeToFile(answersFile, "1.答案1"); // 填入一个正确答案
        IOUtil.writeToFileAppend(answersFile, "\n2.错误答案"); // 填入一个错误答案
        IOUtil.writeToFileAppend(answersFile, "\n3.答案3"); // 正确答案
        IOUtil.writeToFileAppend(answersFile, "\n4.答案4"); // 正确答案
        IOUtil.writeToFileAppend(answersFile, "\n5.错误答案"); // 错误答案
        IOUtil.writeToFileAppend(answersFile, "\n6.答案6"); // 正确答案
        IOUtil.writeToFileAppend(answersFile, "\n7.答案7"); // 正确答案
        IOUtil.writeToFileAppend(answersFile, "\n8.错误答案"); // 错误答案
        IOUtil.writeToFileAppend(answersFile, "\n9.答案9"); // 正确答案
        IOUtil.writeToFileAppend(answersFile, "\n10.错误答案"); // 错误答案

        MainUI.checkFormula(exercisesFile, answersFile);

        // 验证 Grade.txt 内容
        String gradeContent = new String(Files.readAllBytes(Paths.get(gradeFile)));
        assertTrue(gradeContent.contains("Correct:"), "Grade.txt 未包含正确答案统计");
        assertTrue(gradeContent.contains("Wrong:"), "Grade.txt 未包含错误答案统计");
    }

    private long countLines(String filePath) throws IOException {
        return Files.lines(Paths.get(filePath)).count();
    }*/
}
