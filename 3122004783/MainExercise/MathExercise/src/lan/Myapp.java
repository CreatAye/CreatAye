package lan;

public class Myapp {
    public static void main(String[] args){
        if(args.length<4){
            System.out.println("参数不足，请按如下格式输入：Myapp.exe -n <题目数量> -r <题目数值范围>");
            return;
        }

        if(args[0].equals("-n")&&args[2].equals("-r")){
            MainUI.creatFormula(Integer.parseInt(args[1]),Integer.parseInt(args[3]));
            System.out.println("题目创建成功！题目文件为Exercise.txt，对应答案文件为Answer.txt。");
            System.out.println("作答请按如下格式输入：Myapp.exe -e <exercisefile>.txt -a <answerfile>.txt");
        }
        else if(args[0].equals("-e")&&args[2].equals("-a")){
            MainUI.checkFormula(args[1],args[3]);
        }
        else {
            System.out.println("输入参数有误,请按如下格式输入：Myapp.exe -n <题目数量> -r <题目数值范围> 或 Myapp.exe -e <exercisefile>.txt -a <answerfile>.txt");
        }
    }
}
