package ru.sovs;

import java.util.function.Consumer;

/**
 * Тестовый калькулятор
 */
public class Calculator {

    public int sum(int a, int b) {
        Consumer<Integer> consumer = new Consumer<Integer>() {
            public void accept(Integer integer) {

            }
        };

        return a + b;
    }
}
