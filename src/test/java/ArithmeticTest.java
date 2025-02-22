import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArithmeticTest {
    ArithematicOp a = new ArithematicOp();
    // there is only a single class for all methods now (add, sub, mul , div)
    @Test
    public void testAddition() {
        // call the method on the instance variable a
        assertEquals(10, a.addNum(5, 5));
    }

    @Test
    public void testSubtraction() {
        assertEquals(3, a.sub(8, 5));
    }

    @Test
    public void testMultiplication() {
        assertEquals(20, a.prod(4, 5));
    }
    @Test
    @DisplayName("Custom display name given by dev for code readability ")
    public void testMultiplication1 () {
          Assertions.assertTrue(a.product(5,6));
    }// Methods with @Test annotations have method signature as public void always
    // JUnit  recognize the method as a Test method only if it is a void type and non-void or int
    // return type are not considered as Test methods by Junit
    @Test
    public void testDivision() {
        assertEquals(2, a.divNum(10, 5));
    }

//    @Test
//    public void testDivisionByZero() {
//        Exception exception = assertThrows(ArithmeticException.class, () -> {
//            division.divide(10, 0);
//        });
//        assertEquals("Cannot divide by zero", exception.getMessage());
//    }
}
