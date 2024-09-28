package lan;
import java.util.Random;
import java.util.Arrays;
import java.lang.String;
import java.lang.StringBuilder;
public class Formula {
    private Random random=new Random();
    //符号个数
    private  int symbolNum=random.nextInt(3)+1;
    //算式符号数组
    private  String[] symbol=new String[symbolNum];
    //算式数字数组
    private  String[] num=new String[symbolNum+1];
    //算式字符串
    private  String formula;
    //算式答案
    private  String answer;
    //构造函数
    public Formula(int range) {
        do {
            //生成随机符号
            for (int i = 0; i < symbolNum; i++)
                symbol[i] = getSymbol();
            //生成随机数字
            for (int i = 0; i < symbolNum + 1; i++) {
                if (random.nextInt(2) == 0) {//生成自然数
                    num[i] = String.valueOf(random.nextInt(range));
                } else {//生成分数
                    Fraction fraction = new Fraction(range);
                    num[i] = Conversion.getFractionToString(fraction);
                }
            }
            //降低式子中存在负数的可能
            for (int i = 0; i < symbolNum; i++)
                if (symbol[i].equals(" - "))
                    if (Conversion.getStringToDigit(num[i]) < Conversion.getStringToDigit(num[i + 1])) {
                        //临时变量用于交换
                        String temp;
                        temp = num[i];
                        num[i] = num[i + 1];
                        num[i + 1] = temp;
                    }
            //符号与数字组合得到算式
            formula = num[0];
            for (int i = 0; i < symbolNum; i++) {
                formula = formula + symbol[i] + num[i + 1];
            }
            if (random.nextInt(2) == 0)//0则为算式插入括号
                formula = insertKuoHao(formula);
            formula=formula+" = ";
            answer=Calculate.getFormulaAnswer(formula);
        }while(answer.equals("error"));
    }
    public String getFormula(){return formula;}
    public String getAnswer(){
        return answer;
    }
    //随机插入括号
    private String insertKuoHao(String str){
        StringBuilder newExpression = new StringBuilder();
        int start=random.nextInt(symbolNum);
        int end=random.nextInt(symbolNum-start)+start+1;
        for(int i=0;i<=symbolNum;i++){
            if(i==start)
                newExpression.append("(");
            newExpression.append(num[i]);
            if(i==end)
                newExpression.append(")");
            if(i<symbolNum)
                newExpression.append(symbol[i]);
        }
        return newExpression.toString();
    }
    //给出随机符号
    private String getSymbol(){
        String[] symbol={" + "," - "," × "," ÷ "};
        return symbol[random.nextInt(symbol.length)];
    }
    public static void main(String[] args){
        for(int i=0;i<100;i++){
            Formula formula1=new Formula(100);
            System.out.println(i+"."+formula1.getFormula()+formula1.answer);
        }
    }
}
