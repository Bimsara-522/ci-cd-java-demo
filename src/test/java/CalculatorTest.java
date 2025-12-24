package test.java;

import static org.junit.jupiter.api.Assertions.*;

import main.java.Calculator;
import org.junit.Test;

public class CalculatorTest {

    @Test
    void testAdd() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(2, 3));
    }
}

