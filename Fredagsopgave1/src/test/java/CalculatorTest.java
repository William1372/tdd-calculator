import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    Calculator c = new Calculator();

    @Test
    void addTest(){

        assertEquals(100,c.add(25,75));

    }

    @Test
    void subtractTest(){

        assertEquals(150,c.subtract(225,75));

    }

    @Test
    void multiplyTest(){

        assertEquals(180,c.multiply(60,3));

    }

    @Test
    void divideTest(){

        assertEquals(120,c.divide(360,3));

    }

}