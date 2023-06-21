package pro.sky.homework13tests.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParametrizedCalculatorServiceTest {
    CalculatorService calculatorService = new CalculatorServiceImpl();

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(1, 6),
                Arguments.of(23, 5),
                Arguments.of(-1919, 2345),
                Arguments.of(43, 234),
                Arguments.of(11, 6545),
                Arguments.of(123, -203)
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void print(int num1, int num2) {
        System.out.println(num1 + ", " + num2);
    }

    @ParameterizedTest
    @MethodSource("data")
    void plus(int num1, int num2) {
        int excepted = num1 + num2;
        int result = calculatorService.plus(num1, num2);
        assertEquals(excepted, result);
    }

    @ParameterizedTest
    @MethodSource("data")
    void minus(int num1, int num2) {
        int excepted = num1 - num2;
        int result = calculatorService.minus(num1, num2);
        assertEquals(excepted, result);
    }

    @ParameterizedTest
    @MethodSource("data")
    void multiply(int num1, int num2) {
        int excepted = num1 * num2;
        int result = calculatorService.multiply(num1, num2);
        assertEquals(excepted, result);
    }

    @ParameterizedTest
    @MethodSource("data")
    void divide(int num1, int num2) {
        int excepted = num1 / num2;
        int result = calculatorService.divide(num1, num2);
        assertEquals(excepted, result);
    }
}
