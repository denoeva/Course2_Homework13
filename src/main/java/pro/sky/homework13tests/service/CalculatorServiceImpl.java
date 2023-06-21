package pro.sky.homework13tests.service;

import pro.sky.homework13tests.exceptions.DivisionByZeroException;

public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public int plus(int a, int b) {
        return a + b;
    }

    @Override
    public int minus(int a, int b) {
        return a - b;
    }

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }

    @Override
    public int divide(int a, int b) {
        if (b == 0) {
            throw new DivisionByZeroException();
        }
        return a / b;
    }
}
