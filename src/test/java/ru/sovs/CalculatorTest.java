package ru.sovs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void sum() {
        Assertions.assertEquals(3, calculator.sum(1,2), "1 + 2 = 3");
    }
}