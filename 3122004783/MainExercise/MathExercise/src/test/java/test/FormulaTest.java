package test;
import lan.*;
import org.junit.Test;
public class FormulaTest {
    /*@Test
    public void testFormulaGeneration() {
        // 创建多个公式实例并验证它们是否正确生成
        for (int i = 0; i < 100; i++) {
            Formula formulaInstance = new Formula(100);
            String formula = formulaInstance.getFormula();
            assertNotNull(formula, "公式不应为 null");
            assertTrue(formula.endsWith(" = "), "公式应以 ' = ' 结尾");

            // 额外检查公式中是否包含有效的符号和数字
            assertTrue(formula.matches(".*[\\+\\-×÷].*"), "公式应至少包含一个运算符");
        }
    }

    @Test
    public void testAnswerCalculation() {
        // 确保答案计算正确
        Formula formulaInstance = new Formula(100);
        String answer = formulaInstance.getAnswer();
        assertNotNull(answer, "答案不应为 null");
        assertFalse(answer.equals("error"), "答案不应为 'error'");

        // 进一步验证答案需要根据生成的公式进行解析和评估，这可能比较复杂。
    }

    @Test
    public void testRandomness() {
        // 检查多个实例生成不同的公式
        Formula formula1 = new Formula(100);
        Formula formula2 = new Formula(100);

        assertNotEquals(formula1.getFormula(), formula2.getFormula(), "公式不应相同，因其具有随机性");
    }

    @Test
    public void testInsertKuoHao() {
        // 手动检查括号是否正确插入
        String testFormula = "3 + 5 × 2 - 4";
        String result = Formula.insertKuoHao(testFormula);
        // 确保结果中包含括号
        assertTrue(result.contains("("), "结果应包含 '('");
        assertTrue(result.contains(")"), "结果应包含 ')'");
    }*/
}
