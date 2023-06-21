package pro.sky.homework13tests.service;

import org.junit.jupiter.api.Test;
import pro.sky.homework13tests.exceptions.DivisionByZeroException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorServiceTest {
    CalculatorService calculatorService = new CalculatorServiceImpl();

    @Test
    void sumPositive() {
        assertEquals(10, calculatorService.plus(2, 8));
    }

    @Test
    void sumNegative() {
        assertEquals(-10, calculatorService.plus(-2, -8));
    }

    @Test
    void sumZero() {
        assertEquals(5, calculatorService.plus(5, 0));
    }

    @Test
    void minPositive() {
        assertEquals(10, calculatorService.minus(18, 8));
    }

    @Test
    void minNegative() {
        assertEquals(-1, calculatorService.minus(2, 3));
    }

    @Test
    void minZero() {
        assertEquals(5, calculatorService.minus(5, 0));
    }

    @Test
    void multiplyPositive() {
        assertEquals(10, calculatorService.multiply(2, 5));
    }

    @Test
    void multiplyNegative() {
        assertEquals(-6, calculatorService.multiply(2, -3));
    }

    @Test
    void multiplyZero() {
        assertEquals(0, calculatorService.multiply(5, 0));
    }

    @Test
    void dividePositive() {
        assertEquals(10, calculatorService.divide(20, 2));
    }

    @Test
    void divideNegative() {
        assertEquals(-6, calculatorService.divide(24, -4));
    }

    @Test
    void divisionByZero() {
        assertThrows(DivisionByZeroException.class, () -> {
                calculatorService.divide(5,0);
            });
    }
}
