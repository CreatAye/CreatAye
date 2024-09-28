package test;
import lan.*;
import org.junit.Test;
public class ConversionTest {

    /*@Test
    public void testGetStringToDigit() {
        // 测试字符串转化为小数方法

        // 测试自然数
        assertEquals(5.0, Conversion.getStringToDigit("5"), 0.001);

        // 测试分数
        assertEquals(0.5, Conversion.getStringToDigit("1/2"), 0.001);

        // 测试带分数
        assertEquals(2.75, Conversion.getStringToDigit("2'3/4"), 0.001);

        // 测试负数情况
        assertEquals(-1.0, Conversion.getStringToDigit("-3"));
    }

    @Test
    public void testGetStringToFraction() {
        // 测试字符串转化为分数方法

        // 测试自然数
        Fraction fraction1 = Conversion.getStringToFraction("5");
        assertEquals(5, fraction1.fenZi);
        assertEquals(1, fraction1.fenMu);

        // 测试分数
        Fraction fraction2 = Conversion.getStringToFraction("3/4");
        assertEquals(3, fraction2.fenZi);
        assertEquals(4, fraction2.fenMu);

        // 测试带分数
        Fraction fraction3 = Conversion.getStringToFraction("1'1/2");
        assertEquals(3, fraction3.fenZi);
        assertEquals(2, fraction3.fenMu);
    }

    @Test
    public void testGetFractionToString() {
        // 测试分数转化为字符串方法

        // 测试真分数
        Fraction f1 = new Fraction(2, 3);
        assertEquals("2/3", Conversion.getFractionToString(f1));

        // 测试假分数
        Fraction f2 = new Fraction(5, 3);
        assertEquals("1'2/3", Conversion.getFractionToString(f2));

        // 测试整数
        Fraction f3 = new Fraction(4, 1);
        assertEquals("4", Conversion.getFractionToString(f3));

        // 测试零
        Fraction f4 = new Fraction(0, 5);
        assertEquals("0", Conversion.getFractionToString(f4));
    }*/
}