package lan;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MainUI {
    public static void creatFormula(int range,int amount){
        IOUtil.clearFile("Exercises.txt");
        IOUtil.clearFile("Answers.txt");
        for(int i=0;i<amount;i++){
            Formula formula=new Formula(range);
            IOUtil.writeToFile("Exercises.txt",(i+1)+"."+formula.getFormula());
            IOUtil.writeToFile("Answers.txt",(i+1)+"."+formula.getAnswer());
        }
    }
    public static void checkFormula(String execrisePath,String answerPath){
        ArrayList<String> correct=new ArrayList<>();
        ArrayList<String> wrong=new ArrayList<>();
        try (BufferedReader reader1 = new BufferedReader(new FileReader(answerPath));
             BufferedReader reader2 = new BufferedReader(new FileReader("Answers.txt"))) {
            String line1;
            String line2;
            while ((line1 = reader1.readLine()) != null&&(line2 = reader2.readLine()) != null) {
                String[] parts1=line1.split("\\.");
                String[] parts2=line2.split("\\.");
                if(parts1[1].equals(parts2[1])){
                    correct.add(parts1[0]);
                }else {
                    wrong.add(parts1[0]);
                }
            }
            IOUtil.clearFile("Grade.txt");
            IOUtil.writeToFileAppend("Grade.txt","Correct:"+correct.size()+"(");
            int correctSize= correct.size();
            for(int i=0;i<correctSize;i++) {
                if(i!=correctSize-1)
                    IOUtil.writeToFileAppend("Grade.txt", correct.get(i)+",");
                else{
                    IOUtil.writeToFileAppend("Grade.txt", correct.get(i));
                }
            }
            IOUtil.writeToFile("Grade.txt", ")");
            IOUtil.writeToFileAppend("Grade.txt","Wrong:"+wrong.size()+"(");
            int wrongSize= wrong.size();
            for(int i=0;i<wrongSize;i++){
                if(i!=wrongSize-1)
                    IOUtil.writeToFileAppend("Grade.txt", wrong.get(i)+",");
                else{
                    IOUtil.writeToFileAppend("Grade.txt", wrong.get(i));
                }
            }
            IOUtil.writeToFileAppend("Grade.txt", ")");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("未找到要检查的文件！");
        }
    }
    public static void main(String[] args){
        String a="Exercises.txt";
        String b="Answers.txt";
        /*creatFormula(10,10);
        IOUtil.readFromFile(a);
        IOUtil.readFromFile(b);*/

        String c="Grade.txt";
        checkFormula(a,"myAnswer.txt");
        IOUtil.readFromFile(c);
    }
}
