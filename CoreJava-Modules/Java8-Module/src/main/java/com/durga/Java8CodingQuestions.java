package com.durga;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author durganaresh on 2/19/25
 */
public class Java8CodingQuestions {
  public static void main(String[] args){
    calculateAverageOfIntegers();
    convertStringsToUppercaseLowercase();
    calculateSumOfAllEvenOddNumbers();
    removeAllDuplicateElements();
    countNumberOfStringsWithSpecificLetter();
    sortStringsAlphabeticalOrder();
    CountNumberStringsHaveLengthGreaterThan5();
    findFirstElement();
    findSecondSmallestAndLargestElements();
    findMaximumAndMinimumValues();
  }
  public static void calculateAverageOfIntegers() {
    System.out.println("Calculate Average of Integers using Streams");
    System.out.println("-------------------------------------------");
    var nums = Arrays.asList(1, 3, 6, 8, 10, 18, 36);
    final double averageValue =
        nums.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);
    System.out.println("Average value is: " + averageValue);
  }

  public static void convertStringsToUppercaseLowercase() {
    System.out.println("Convert a list of strings to uppercase or lowercase using streams");
    System.out.println("-----------------------------------------------------------------");
    var names = Arrays.asList("Sachin", "manisH", "Suresh");
    final List<String> uppercaseNames = names.stream().map(String::toUpperCase).toList();

    final List<String> lowercaseNames = names.stream().map(String::toLowerCase).toList();

    uppercaseNames.forEach(System.out::println);
    System.out.println("------------");
    lowercaseNames.forEach(System.out::println);
  }

  public static void calculateSumOfAllEvenOddNumbers() {
    System.out.println(" Calculate the sum of all even, odd numbers in a list using streams.");
    System.out.println("-------------------------------------------------------------------");
    var nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
    final int evenSum = nums.stream().mapToInt(Integer::intValue).filter(n -> n % 2 == 0).sum();

    final int oddSum = nums.stream().mapToInt(Integer::intValue).filter(n -> n % 2 != 0).sum();

    System.out.println("Sum of Even Number is : " + evenSum);
    System.out.println("Sum of Odd Number is : " + oddSum);
  }

  public static void removeAllDuplicateElements() {
    System.out.println("Remove all duplicate elements from a list using streams.");
    System.out.println("--------------------------------------------------------");
    var numbers = Arrays.asList(1, 1, 3, 2, 5, 7, 7, 37, 8, 3654, 3, 2, 1);
    Stream<Integer> distinctNumbers = numbers.stream().distinct();
    distinctNumbers.forEach(System.out::println);
  }

  public static void countNumberOfStringsWithSpecificLetter() {
    System.out.println(
        "Count the number of strings in a list that start with a specific letter using streams.");
    System.out.println("----------------------------------------------------------------------");
    var names = Arrays.asList("Sachin", "Krutika", "Josh", "Mrunal", "Van", "Josh", "Jason");
    long count = names.stream().filter(name -> name.startsWith("J")).count();
    System.out.println("Count of Names starts with J : " + count);
  }

  public static void sortStringsAlphabeticalOrder() {
    System.out.println(
        "Sort a list of strings in alphabetical order, ascending and descending using streams.");
    System.out.println("----------------------------------------------------------------------");
    List<String> list = new ArrayList<>(List.of("Sachin", "Amar", "Aman", "Vijay", "Esha"));

    List<String> sorted = list.stream().sorted().toList();

    List<String> descendingSorted = list.stream().sorted((a, b) -> b.compareTo(a)).toList();

    System.out.println("ASC Sorted List is : ");
    System.out.println("-------------------");
    sorted.forEach(e -> System.out.print(e + " "));
    System.out.println();
    System.out.println("DESC Sorted List is : ");
    System.out.println("---------------------");
    descendingSorted.forEach(e -> System.out.print(e + " "));
  }

  public static void CountNumberStringsHaveLengthGreaterThan5() {
    System.out.println("count the number of strings that have a length greater than 5");
    System.out.println("--------------------------------------------------------------");
    List<String> list = new ArrayList<>(List.of("he", "hello", "kiamotors", "helloworld", "hd"));
    long count = list.stream().filter(e -> e.length() > 5).count();
    System.out.println(count);
  }

  public static void findFirstElement() {
    System.out.println("Find the first element of a Stream in Java (Geeks for Geeks)");
    System.out.println("------------------------------------------------------------");
    List<String> strings = Arrays.asList("Geeks", "for", "Geeks", "is", "a", "DSA", "portal");
    Optional<String> firstElement = strings.stream().findFirst();
    // Check if the first element is present and print it
    firstElement.ifPresent(System.out::println);
  }

  public static void findSecondSmallestAndLargestElements() {
    System.out.println(
        "Find the second smallest and largest elements in a list of integers using streams.");
    System.out.println("------------------------------------------------------------------");
    List<Integer> numbers = Arrays.asList(7, 2, 5, 3, 9, 1, 4, 8, 6);
    Optional<Integer> secondSmallest = numbers.stream().sorted().distinct().skip(1).findFirst();

    Optional<Integer> secondLargest =
        numbers.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst();
    secondSmallest.ifPresent(s -> System.out.println("Second Smallest: " + s));
    secondLargest.ifPresent(s -> System.out.println("Second Largest: " + s));
  }

  public static void findMaximumAndMinimumValues() {
    System.out.println("Find the maximum and minimum values in a list of integers using streams.");
    System.out.println("------------------------------------------------------------------------");
    List<Integer> integers = new ArrayList<>(List.of(20, 11, 1, 122, -1, 0));
    Integer max = integers.stream().max(Integer::compareTo).get();

    Integer min = integers.stream().min(Integer::compareTo).get();

    System.out.println("Maximum integer in a list : " + max);
    System.out.println("Minimum integer in a list : " + min);
  }
}
