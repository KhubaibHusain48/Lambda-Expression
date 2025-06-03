package Concepts.LambdaExpressions;

import java.util.function.BiConsumer;

public class lambda {
    public static void main(String[] args) {
        // lambda syntax: (parameters) -> {body}

        BiConsumer<Integer, Integer> add = (a, b) -> {
            int sum = a + b;
            System.out.println(sum);
        };

        add.accept(10, 20); // Output: 30
    }
}
