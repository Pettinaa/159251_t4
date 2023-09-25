package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalcTest {
  Calc c = new Calc();

    @Test
    void testAddition() {
        assertEquals(4, c.add(2,2));
    }
@Test
    public void testSubtraction() {
        // 定义测试数据和预期结果
        int a = 4;
        int b = 2;
        int expected = 2;

        // 调用你的代码进行减法操作
        Calculator calculator = new Calculator();
        int actual = calculator.subtract(a, b);

        // 使用断言来验证实际结果是否与预期结果一致
        assertEquals(expected, actual);
    }

}
