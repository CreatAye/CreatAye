package lan;
import java.util.Stack;
import java.lang.Throwable;
public class Calculate {
    // 计算最大公约数
    public static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    //计算算式
    public static String getFormulaAnswer(String formula){
        char[] tokens = formula.toCharArray();
        Stack<String> values = new Stack<>(); // 存储操作数
        Stack<Character> operators = new Stack<>(); // 存储操作符
        String answer;
        for (int i = 0; i < tokens.length; i++) {
            // 当前字符是空格，跳过
            if (tokens[i] == ' ') continue;

            // 当前字符是数字
            if (Character.isDigit(tokens[i])) {
                StringBuilder sb = new StringBuilder();
                while (i < tokens.length &&( Character.isDigit(tokens[i]) || tokens[i]=='\'' || tokens[i]=='/')) {
                    sb.append(tokens[i++]);
                }
                values.push(sb.toString());
                i--; // 回退一个位置，继续处理
            }
            // 当前字符是左括号
            else if (tokens[i] == '(') {
                operators.push(tokens[i]);
            }
            // 当前字符是右括号
            else if (tokens[i] == ')') {
                while (!operators.isEmpty() && operators.peek() != '(') {
                    answer=applyOperator(operators.pop(), values.pop(), values.pop());
                    if(isRight(answer))
                        values.push(answer);
                    else
                        return "error";
                }
                operators.pop(); // 弹出左括号
            }
            // 当前字符是操作符
            else if (isOperator(tokens[i])) {
                while (!operators.isEmpty() && hasPrecedence(tokens[i], operators.peek())) {
                    answer=applyOperator(operators.pop(), values.pop(), values.pop());
                    if(isRight(answer))
                        values.push(answer);
                    else
                        return "error";
                }
                operators.push(tokens[i]);
            }
        }
        // 处理剩余的操作符
        while (!operators.isEmpty()) {
            answer=applyOperator(operators.pop(), values.pop(), values.pop());
            if(isRight(answer))
                values.push(answer);
            else
                return "error";
        }

        return values.pop();
    }
    //运算法则
    private static String applyOperator(char op, String stra,String strb) throws IllegalArgumentException, ArithmeticException {
        Fraction a=Conversion.getStringToFraction(stra);
        Fraction b=Conversion.getStringToFraction(strb);
        switch (op) {
            case '+':
                return Conversion.getFractionToString(Fraction.add(a,b));
            case '-':
                return Conversion.getFractionToString(Fraction.sub(a,b));
            case '×':
                return Conversion.getFractionToString(Fraction.mul(a,b));
            case '÷':
                if(Conversion.getFractionToString(b).equals("0"))
                    return "error";
                return Conversion.getFractionToString(Fraction.div(a,b));
            default:
                throw new IllegalArgumentException("Invalid operator: " + op);
        }
    }
    //验证答案合理性
    private static boolean isRight(String answer){
        if(answer.equals("error"))
            return false;
        return !(Conversion.getStringToDigit(answer) <= 0);
    }
    //判断运算符
    private static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '×' || c == '÷';
    }
    //决定运算符优先级
    private static boolean hasPrecedence(char op1, char op2) {
        if (op2 == '(' || op2 == ')') return false;
        return (op1 != '×' && op1 != '÷') || (op2 != '+' && op2 != '-');
    }
    public static void main(String[] args){
        Formula formula=new Formula(100);
        System.out.println(formula.getFormula());
        /*String[] parts = formula.split(" ");
        for(int i=0;i<parts.length;i++)
            System.out.println(parts[i]);*/
        System.out.println(getFormulaAnswer(formula.getFormula()));
    }
}
