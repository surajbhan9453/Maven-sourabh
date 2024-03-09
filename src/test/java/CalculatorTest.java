import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class CalculatorTest {
    Calculator calculator = new Calculator();
    @Test
    public void testAdd() {
        
        assertEquals(5, calculator.add(2, 3));
        assertEquals(-1, calculator.add(-5, 4));
    }
    
    @Test
    public void testSubtract() {
        assertEquals(1, calculator.subtract(4, 3));
        assertEquals(-6, calculator.subtract(-2, 4));
    }
    
    @Test
    public void testMultiply() {
        assertEquals(6, calculator.multiply(2, 3));
        assertEquals(-8, calculator.multiply(-2, 4));
    }
    
    @Test
    public void testDivide() {
        assertEquals(3, calculator.divide(9, 3));
        assertEquals(-2, calculator.divide(-10, 5));
    }
    
    @Test
    public void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(5, 0));
    }
}
