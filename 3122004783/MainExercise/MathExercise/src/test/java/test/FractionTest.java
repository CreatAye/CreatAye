package test;
import lan.*;
import org.junit.Test;
public class FractionTest {
    /*// 测试分数的构造函数（随机范围）
    @Test
    public void testRandomConstructor() {
        Fraction fraction = new Fraction(10);
        assertTrue(fraction.fenMu > 0 && fraction.fenMu < 10, "分母应该在1到9之间");
        assertTrue(fraction.fenZi >= 0 && fraction.fenZi < 10, "分子应该在0到9之间");
    }

    // 测试指定分子和分母的构造函数
    @Test
    public void testFractionConstructor() {
        Fraction fraction = new Fraction(3, 4);
        assertEquals(3, fraction.fenZi, "分子应为3");
        assertEquals(4, fraction.fenMu, "分母应为4");
    }

    // 测试分数加法
    @Test
    public void testAdd() {
        Fraction a = new Fraction(1, 2); // 1/2
        Fraction b = new Fraction(1, 3); // 1/3
        Fraction result = Fraction.add(a, b);
        assertEquals(5, result.fenZi, "1/2 + 1/3 的分子应为5");
        assertEquals(6, result.fenMu, "1/2 + 1/3 的分母应为6");
    }

    // 测试分数减法
    @Test
    public void testSub() {
        Fraction a = new Fraction(1, 2); // 1/2
        Fraction b = new Fraction(1, 3); // 1/3
        Fraction result = Fraction.sub(a, b);
        assertEquals(1, result.fenZi, "1/2 - 1/3 的分子应为1");
        assertEquals(6, result.fenMu, "1/2 - 1/3 的分母应为6");
    }

    // 测试分数乘法
    @Test
    public void testMul() {
        Fraction a = new Fraction(1, 2); // 1/2
        Fraction b = new Fraction(1, 3); // 1/3
        Fraction result = Fraction.mul(a, b);
        assertEquals(1, result.fenZi, "1/2 * 1/3 的分子应为1");
        assertEquals(6, result.fenMu, "1/2 * 1/3 的分母应为6");
    }

    // 测试分数除法
    @Test
    public void testDiv() {
        Fraction a = new Fraction(1, 2); // 1/2
        Fraction b = new Fraction(1, 3); // 1/3
        Fraction result = Fraction.div(a, b);
        assertEquals(3, result.fenZi, "1/2 ÷ 1/3 的分子应为3");
        assertEquals(2, result.fenMu, "1/2 ÷ 1/3 的分母应为2");
    }

    // 测试除以零的异常
    @Test
    public void testDivByZero() {
        Fraction a = new Fraction(1, 2); // 1/2
        Fraction b = new Fraction(0, 1); // 0/1，作为分母
        assertThrows(ArithmeticException.class, () -> {
            Fraction.div(a, b);
        }, "应抛出不能除以零的异常");
    }*/
}
