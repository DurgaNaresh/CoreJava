package com.durga.section2;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Durganaresh - 10/24/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class Lesson5 {
    public static void main(String[] args) {
        Stream.of("One", "Two", "Three")
                // to parallel stream
                .parallel();

        // Or, create directly from a list
        List.of("January", "February", "March")
                // parallelStream() instead of stream()
                .parallelStream();

        // array - parallel() from a stream
        String[] array = {"Coffee", "Capuccino", "Latte"};
        Arrays.stream(array).parallel();

        // parallel reduction using/producing a concurrent map
        ConcurrentMap<Object, List<String>> coffeeByFirstLetter =
                Arrays.stream(array).parallel()//
                        .collect(Collectors.groupingByConcurrent(drink->drink.charAt(0)));
        System.out.println(coffeeByFirstLetter);

    }
}
