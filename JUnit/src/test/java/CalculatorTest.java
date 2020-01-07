import org.junit.Assert;
import org.junit.Assume;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

    public static Calculator calculator;

    @BeforeClass
    public static void createCalculator() {
        calculator = new Calculator();
    }

    @Test
    public void plusTest() {
        calculator.setParam(10);
        Assert.assertEquals(10, calculator.plus(8, 2));
        System.out.println(calculator.param);
    }

    @Test
    public void minusTest() {
        calculator.setParam(15);
        Assert.assertEquals(15, calculator.minus(20, 5));
        System.out.println(calculator.param);
    }

    @Test
    public void squaredTest() {
        calculator.setParam(25);
        Assert.assertEquals(25, calculator.squared(5));
        System.out.println(calculator.param);
    }
}
