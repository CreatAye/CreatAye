package lan;

public class Conversion {
    //字符串转化为小数
    public static double getStringToDigit(String str){
        double number;
        if(str.contains("-"))
            return -1.0;
        if(str.contains("/")){//分数
            if(str.contains("\'")){//带分数
                //一次划分整数与分数
                String[] partsFirst=str.split("'");
                //分数二次划分 分母和分子
                String[] partsSecond=partsFirst[1].split("/");
                int zhengShu=Integer.parseInt(partsFirst[0]);
                int fenZi=Integer.parseInt(partsSecond[0]);
                int fenMu=Integer.parseInt(partsSecond[1]);
                number=(double) (zhengShu*fenMu+fenZi)/fenMu;
            }
            else{
                String[] partsFirst=str.split("/");
                int fenZi=Integer.parseInt(partsFirst[0]);
                int fenMu=Integer.parseInt(partsFirst[1]);
                number=(double)fenZi/fenMu;
            }
        }
        else{//自然数
            number=(double)Integer.parseInt(str);
        }
        return number;
    }
    //字符串转化为分数
    public static Fraction getStringToFraction(String str){
        if(str.contains("/")){
            if(str.contains("'")){
                String[] parts=str.split("[/']");
                long zhengShu=Long.parseLong(parts[0]);
                long fenZi=Long.parseLong(parts[1]);
                long fenMu=Long.parseLong(parts[2]);
                return new Fraction(zhengShu*fenMu+fenZi,fenMu);
            }else{
                String[] parts=str.split("/");
                return new Fraction(Long.parseLong(parts[0]),Long.parseLong(parts[1]));
            }
        }else{
            return new Fraction(Long.parseLong(str),1);
        }
    }
    //分数转化为字符串
    public static String getFractionToString(Fraction f){
        if(f.fenZi<f.fenMu)
            if(f.fenZi!=0){
                return String.valueOf(f.fenZi)+"/"+String.valueOf(f.fenMu);
            }else {
                return String.valueOf(f.fenZi);
            }
        else if(f.fenMu==f.fenZi)
            return String.valueOf(1);
        else{
            long zhengShu=f.fenZi/f.fenMu;
            long yuShu=f.fenZi%f.fenMu;
            if(yuShu!=0)
                return String.valueOf(zhengShu)+"'"+String.valueOf(yuShu)+"/"+String.valueOf(f.fenMu);
            else
                return String.valueOf(zhengShu);
        }
    }
}
