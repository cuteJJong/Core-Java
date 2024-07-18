import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private  Calculator cal;


    @BeforeEach
    void init() {
        this.cal = new Calculator();
    }

    @Disabled @Test
    void test() {
        assertNotNull(this.cal);
    }

    @Test
    void testAdd() {
        assertEquals(8,this.cal.add(3,5));
    }

    @Test
    void testSubtract() {
        assertEquals(5,this.cal.subtract(8,3));
    }

    @Test
    void testMultiply() {
        assertEquals(24,this.cal.multiply(6,4));
    }

    @Test
    void testDivide() {
        assertEquals(4.1,this.cal.divide(25,6));
    }
}