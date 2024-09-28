package lan;
import java.util.Random;
public class Fraction {
    //分数的分子分母
    public long fenZi;
    public long fenMu;
    private static Random random=new Random();
    //随机构造分数
    public Fraction(int range){
        this.fenMu=random.nextInt(range-1)+1;
        this.fenZi=random.nextInt(range);
        simplify();
    }
    //由小数构造一个分数
    /*public Fraction(double xiaoShu){
        // 将小数转换为字符串以便处理
        String xiaoShuString = String.valueOf(xiaoShu);
        // 获取小数点的位置
        int decimalPlaces = xiaoShuString.length() - xiaoShuString.indexOf('.') - 1;
        // 计算分母
        this.fenMu = (long)Math.pow(10, decimalPlaces);
        // 计算分子
        this.fenZi = (long) (xiaoShu * fenMu);
        simplify();
    }*/
    //指定分子分母
    public Fraction(long fenZi,long fenMu){
        this.fenMu=fenMu;
        this.fenZi=fenZi;
        simplify();
    }
    // 分数加法
    public static Fraction add(Fraction a,Fraction b) {
        long newFenZi = a.fenZi * b.fenMu + b.fenZi * a.fenMu;
        long newFenMu = a.fenMu * b.fenMu;
        return new Fraction(newFenZi, newFenMu);
    }

    // 分数减法
    public static Fraction sub(Fraction a,Fraction b) {
        long newFenZi = a.fenZi * b.fenMu - b.fenZi * a.fenMu;
        long newFenMu = a.fenMu * b.fenMu;
        return new Fraction(newFenZi, newFenMu);
    }

    // 分数乘法
    public static Fraction mul(Fraction a,Fraction b) {
        long newFenZi = a.fenZi * b.fenZi;
        long newFenMu = a.fenMu * b.fenMu;
        return new Fraction(newFenZi, newFenMu);
    }

    // 分数除法
    public static Fraction div(Fraction a,Fraction b) {
        if (b.fenZi == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        long newFenZi = a.fenZi * b.fenMu;
        long newFenMu = a.fenMu * b.fenZi;
        return new Fraction(newFenZi, newFenMu);
    }
    // 计算最大公约数并简化分数
    private void simplify() {
        long gcd = Calculate.gcd(this.fenZi, fenMu);
        this.fenZi /= gcd;
        this.fenMu /= gcd;
        // 确保分母为正
        if (fenMu < 0) {
            fenMu = -fenMu;
            fenZi = -fenZi;
        }
    }
    public static void main(String[] args){
        Fraction f=new Fraction(5,6);
        System.out.println(f.fenZi);
        System.out.println(f.fenMu);
        /*Fraction f1=new Fraction(10);
        System.out.println(Conversion.getFractionToString(f1));
        Fraction f2=new Fraction(10);
        System.out.println(Conversion.getFractionToString(f2));
        System.out.println(Conversion.getFractionToString(add(f1,f2)));
        System.out.println(Conversion.getFractionToString(sub(f1,f2)));
        System.out.println(Conversion.getFractionToString(mul(f1,f2)));
        System.out.println(Conversion.getFractionToString(div(f1,f2)));*/
    }
}
