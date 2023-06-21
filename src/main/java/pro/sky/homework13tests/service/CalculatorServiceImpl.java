package pro.sky.homework13tests.service;

import org.springframework.stereotype.Service;
import pro.sky.homework13tests.service.CalculatorService;

@Service
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
        return a / b;
    }
}