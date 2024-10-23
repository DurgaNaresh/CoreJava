package com.durga.streams;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Durganaresh - 10/23/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class StreamsExample1 {

    private static void calculatePersonAgeInYear() {
        LocalDate birthDate = LocalDate.of(1988, 8, 17);
        LocalDate currentDate = LocalDate.now();
        int age = Period.between(birthDate, currentDate).getYears();
        System.out.println("Age of the person is: " + age);
    }

    private static void lastElementInTheArray() {
        int[] intArray = { 0, 1, 2, 3, 4, 5 };
        Integer lastElementInTheArray = Arrays.stream(intArray).boxed().reduce((first, second) -> second).orElse(-1);
        System.out.println("\nlast elements in the array " + lastElementInTheArray);
    }

    private static void firstTenOddNumbers() {
        Stream.iterate(1, i -> i + 2).limit(10).forEach(System.out::print);
    }

    private static void generateFibonacciSeries() {

        Stream.iterate(new int[] { 0, 1 }, t -> new int[] { t[1], t[0] + t[1] }).limit(10).map(t -> t[0])
                .forEach(System.out::print);

        Function<int[], List<Integer>> intArraytoListOFInt = array -> Arrays.stream(array).boxed()
                .collect(Collectors.toList());
        List<Integer> collect = Stream.iterate(new int[] { 0, 1 }, t -> new int[] { t[1], t[0] + t[1] }).limit(10)
                .map(intArraytoListOFInt).flatMap(List::stream).distinct().collect(Collectors.toList());
        System.out.println(collect);
    }

    private static void firstNonRepeatingCharacter() {
        String tempStr = "rohitrohi";
        System.out.println(Arrays.stream(tempStr.split(""))
                .filter(str -> tempStr.indexOf(str) == tempStr.lastIndexOf(str)).findFirst().orElse(""));

    }

    private static void sumOf10NaturalNumber() {
        int sumOf10NaturalNumber = IntStream.rangeClosed(1, 10)
                .sum();
        System.out.println(sumOf10NaturalNumber);
    }

    private static void firstRepeatedCharacter() {
        String word = "rohttoh";
        System.out.println(Arrays.stream(word.split("")).filter(str -> word.indexOf(str) != word.lastIndexOf(str))
                .findFirst().orElse(""));
    }

    private static void duplicateCharactersInString() {
        String word = "rohttoh";
        System.out.println("original String " + word);

        System.out.println(Arrays.stream(word.split("")).filter(str -> word.indexOf(str) != word.lastIndexOf(str))
                .map(str -> str.charAt(0)).collect(Collectors.toList()));
    }

    private static void extractDuplicateElements() {
        List<Integer> duplicateElements = List.of(1, 2, 2, 2, 3, 3, 4, 5, 1, 1, 56, 7, 8, 9, 10);

        System.out.println("maxed Elements " + duplicateElements);

        List<Integer> extractDuplicateElements = duplicateElements.stream()
                .filter(element -> duplicateElements.indexOf(element) != duplicateElements.lastIndexOf(element))
                .distinct().collect(Collectors.toList());

        System.out.println("extract duplicates elements from " + extractDuplicateElements);
    }

    private static void stringsStartsWithNumber() {
        String[] words = { "rohit", "foo", "nemo", "target1", "12Target", "2robot" };

        System.out.println("original Strings " + Arrays.toString(words));

        List<String> stringStartNumber = Arrays.stream(words).filter(word -> Character.isDigit(word.charAt(0)))
                .toList();
        System.out.println("strings started with a number " + stringStartNumber);
    }

    private static void checkIsTheStringPalindrome() {
        String str = "momd";
        String temp = str.replaceAll("\\s+", "").toLowerCase();
        System.out.println("is palindrome string " + IntStream.range(0, temp.length() / 2)
                .noneMatch(i -> temp.charAt(i) != temp.charAt(temp.length() - i - 1)));
    }

    private static void mostRepeatedElement() {
        int[] elements = { 2, 3, 1, 4, 4, 1, 4, 333, 3, 333, 2, 2, 2, 5, 222 };

        System.out.println("original Array" + Arrays.toString(elements));
        Function<Map<Integer, Long>, Integer> maxValuesKey = integerLongMap -> integerLongMap.entrySet().stream()
                .max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElse(Integer.MAX_VALUE);

        Integer maxDuplicateValue = Arrays.stream(elements).boxed().collect(Collectors
                .collectingAndThen(Collectors.groupingBy(Function.identity(), Collectors.counting()), maxValuesKey));

        System.out.println("max duplicate value in the array " + maxDuplicateValue);
    }

    private static void reversedArray() {
        int[] numberArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println("original array" + Arrays.toString(numberArray));
        int[] reversedArray = IntStream.rangeClosed(1, numberArray.length)
                .map(number -> numberArray[numberArray.length - number]).toArray();
        System.out.println("reversedArray Array" + Arrays.toString(reversedArray));
    }

    private static void reverseEachWord() {
        String stmt = "java is OOP language";
        String reverseEachWord = Arrays.stream(stmt.split(" ")).map(word -> new StringBuffer(word).reverse())
                .collect(Collectors.joining(" "));
        System.out.println(reverseEachWord);
    }

    private static void commonElements() {
        List<Integer> oneToTen = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> twoToTen = List.of(2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> commonElements = oneToTen.stream().filter(twoToTen::contains).toList();
        System.out.println(commonElements);
    }

    private static void calculateAndSumAndAverage() {
        List<Integer> oneToTen = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        IntSummaryStatistics summaryStatistics = oneToTen.stream()
                .collect(Collectors.summarizingInt(Integer::intValue));
        System.out.println(summaryStatistics.getSum());
        System.out.println(summaryStatistics.getAverage());
    }

    private static void sortByLengthOfList() {
        List<String> names = Arrays.asList("rohit", "urmila", "rohit", "urmila", "ram", "sham", "sita", "gita");
        names.stream().sorted(Comparator.comparingInt(String::length)).forEach(System.out::println);
    }

    private static void secondLargestNumberFromList() {
        List<Integer> oneToTen = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Integer secondLarge = oneToTen.stream().sorted(Collections.reverseOrder()).skip(1).findFirst()
                .orElse(Integer.MAX_VALUE);

        System.out.println(secondLarge);
    }

    private static void sumOf() {
        List<Integer> oneToTen = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(oneToTen.stream().mapToInt(Integer::intValue).sum());
    }

    private static boolean isAnagram2() {

        String string1 = "listen";
        String string2 = "silent";

        String join1 = Arrays.stream(string1.split("")).sorted().collect(Collectors.joining(""));
        String join2 = Arrays.stream(string2.split("")).sorted().collect(Collectors.joining(""));
        return join1.equals(join2);

    }

    private static void isAnagram() {
        char[] splitIt = "listen".toCharArray();
        char[] splitIt2 = "silent".toCharArray();

        Arrays.sort(splitIt);
        Arrays.sort(splitIt2);
        if (Arrays.equals(splitIt, splitIt2)) {
            System.out.println("is Anagram");
        } else {
            System.out.println("is not anagram");
        }

    }

    private static void min3max3() {
        List<Integer> randomNumbers = List.of(12, 32, 2, 4, 777, 5, 32, 890, 422, 44, 99, 43);
        List<Integer> min3 = randomNumbers.stream().sorted(Integer::compare).limit(3).collect(Collectors.toList());

        List<Integer> max3 = randomNumbers.stream().sorted((x, y) -> Integer.compare(y, x)).limit(3)
                .collect(Collectors.toList());
        System.out.println(min3);
        System.out.println(max3);
    }

    private static void mergeUnsortedArrayIntoSortedWithoutDuplicate() {
        int[] randomNumbers = { 12, 32, 2, 4, 777, 5, 32, 890, 422, 44, 99, 43 };
        int[] randomNumber2 = { 4, 32, 2, 5, 6, 78, 98, 53, 90 };

        System.out.println(Arrays.toString(
                IntStream.concat(Arrays.stream(randomNumbers), Arrays.stream(randomNumber2)).distinct().toArray()));
    }

    private static void mergeUnsortedArrayIntoSorted() {
        int[] randomNumbers = { 12, 32, 2, 4, 777, 5, 32, 890, 422, 44, 99, 43 };
        int[] randomNumber2 = { 4, 3, 2, 5, 6, 78, 98, 53, 90 };

        int[] sortedArrayByMergingTwoArray = IntStream
                .concat(Arrays.stream(randomNumbers), Arrays.stream(randomNumber2)).sorted().toArray();
        System.out.println(Arrays.toString(sortedArrayByMergingTwoArray));
    }

    private static void minMaxFromList() {
        List<Integer> randomNumbers = List.of(12, 32, 2, 4, 777, 5, 32, 890, 422, 44, 99, 43);
        Integer maxNumber = randomNumbers.stream().max(Integer::compareTo).orElse(Integer.MAX_VALUE);
        Integer minValue = randomNumbers.stream().min(Integer::compareTo).orElse(Integer.MIN_VALUE);
        System.out.println(maxNumber);
        System.out.println(minValue);
        IntSummaryStatistics summaryStatistics = randomNumbers.stream()
                .collect(Collectors.summarizingInt(Integer::intValue));
        System.out.println(summaryStatistics.getMax());
        System.out.println(summaryStatistics.getMin());
        System.out.println(summaryStatistics.getCount());
        System.out.println(summaryStatistics.getSum());
        System.out.println(summaryStatistics.getAverage());
    }

    private static void multipleOf5() {
        List<Integer> randomNumbers = List.of(12, 32, 2, 4, 777, 5, 32, 890, 422, 44, 99, 43);
        List<Integer> multipleOf5 = randomNumbers.stream().filter(n -> n % 5 == 0).collect(Collectors.toList());
        System.out.println(multipleOf5);
    }

    private static void joinListOfStrings() {
        List<String> languageList = List.of("java", "c++", "c", "C sharp", "python", "kotlin", "scala");
        String joinWithPrefixSuffixAndDelimiter = languageList.stream().collect(Collectors.joining(",", "[", "]"));
        System.out.println(joinWithPrefixSuffixAndDelimiter);
    }

    private static void reverseSortedList() {
        List<Integer> randomNumbers = List.of(12, 32, 2, 4, 777, 5, 32, 890, 422, 44, 99, 43);
        // this is throwing unsupportedOprerationException because we are
        // tries to sort ImmutableList that is not allowed .
        // randomNumbers.sort(Comparator.reverseOrder());
        System.out.println(randomNumbers);
        List<Integer> sortInReverse = randomNumbers.stream().sorted((x, y) -> Integer.compare(y, x)) // reverse sort
                .collect(Collectors.toList());
        System.out.println(sortInReverse);

        List<Integer> sortListReverse = randomNumbers.stream().sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(sortListReverse);

    }

    private static void wordFrequency() {
        List<String> names = Arrays.asList("rohit", "urmila", "rohit", "urmila", "ram", "sham", "sita", "gita");
        Map<String, Long> frequencyWords = names.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(frequencyWords);
    }

    private static void characterFrequency() {
        String name = "rohitroh";
        Map<String, Long> characterFrequency = Arrays.stream(name.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(characterFrequency);

        Map<Character, Long> collected = name.chars().mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collected);

        Map<String, Integer> countCharacter = Arrays.stream(name.split("")).collect(Collectors
                .groupingBy(Function.identity(), Collectors.collectingAndThen(Collectors.counting(), Long::intValue)));
        System.out.println(countCharacter);
    }

    private static void removeDuplicateFromList() {
        List<Integer> oneToTen = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> removeDuplicate = oneToTen.stream().distinct().collect(Collectors.toList());

        System.out.println(removeDuplicate);
        Set<Integer> removeDuplicateWithoutOrder = oneToTen.stream().collect(Collectors.toSet());
        System.out.println(removeDuplicateWithoutOrder);

        List<Integer> uniqueElement = oneToTen.stream()
                .filter(number -> oneToTen.indexOf(number) == oneToTen.lastIndexOf(number))
                .collect(Collectors.toList());
        System.out.println(uniqueElement);
    }

    private static void separationOfEvenOddNumberInList() {
        List<Integer> oneToTen = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Collection<List<Integer>> evenOddList = oneToTen.stream()
                .collect(Collectors.collectingAndThen(Collectors.partitioningBy(i -> i % 2 == 0), Map::values));

        System.out.println(evenOddList);
    }

    private static void separationOfEvenOddNumberInMap() {
        List<Integer> oneToTen = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Map<Boolean, List<Integer>> evenAddOddSeparation = oneToTen.stream()
                .collect(Collectors.partitioningBy(i -> i % 2 == 0));

        System.out.println(evenAddOddSeparation);
    }

    //  Question: Calculate Average of Integers using Streams
    //  Remember to use double as avg is in double as well
    public static void averageOfIntegers() {
        var nums = Arrays.asList(1, 3, 6, 8, 10, 18, 36);
        final double averageValue = nums.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);
        System.out.println("Average value is: " + averageValue);
    }

    //  Convert a list of strings to uppercase or lowercase using streams
    public static void UpperCaseLowerCase() {
        var names = Arrays.asList("Sachin", "manisH", "Suresh");
        final List<String> uppercaseNames = names.stream()
                .map(String::toUpperCase)
                .toList();

        final List<String> lowercaseNames = names.stream()
                .map(String::toLowerCase)
                .toList();

        uppercaseNames.forEach(System.out::println);
        System.out.println("------------");
        lowercaseNames.forEach(System.out::println);
    }

    // Calculate the sum of all even, odd numbers in a list using streams.
    public static void sumOfEvenOddNumbers() {
        var nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        final int evenSum = nums.stream()
                .mapToInt(Integer::intValue)
                .filter(n -> n % 2 == 0)
                .sum();

        final int oddSum = nums.stream()
                .mapToInt(Integer::intValue)
                .filter(n -> n % 2 != 0)
                .sum();

        System.out.println("Sum of Even Number is : " + evenSum);
        System.out.println("Sum of Odd Number is : " + oddSum);

    }

    // Remove all duplicate elements from a list using streams.
    public static void duplicateElements() {
        var numbers = Arrays.asList(1, 1, 3, 2, 5, 7, 7, 37, 8, 3654, 3, 2, 1);
        Stream<Integer> distinctNumbers = numbers.stream().distinct();

        distinctNumbers.forEach(System.out::println);
    }

    // Count the number of strings in a list that start with a specific letter using streams.
    public static void numberOfStrings() {
        var names = Arrays.asList("Sachin", "Krutika", "Josh", "Mrunal", "Van", "Josh", "Jason");

        long count = names.stream()
                .filter(name -> name.startsWith("J"))
                .count();

        System.out.println("Count of Names starts with J : " + count);
    }


    public static void sortListAlphabeticalOrder() {
        List<String> list = new ArrayList<>(List.of("Sachin","Amar","Aman","Vijay","Esha"));
        List<String> sorted = list.stream()
                .sorted()
                .collect(Collectors.toList());
        List<String> descendingSorted = list.stream()
                .sorted((a,b)->b.compareTo(a))
                .collect(Collectors.toList());
        System.out.println("ASC Sorted List is : ");
        sorted.stream().forEach(e -> System.out.print(e +" "));
        System.out.println();
        System.out.println("DESC Sorted List is : ");
        descendingSorted.stream().forEach(e -> System.out.print(e +" "));

    }

    public static void maximumAndMinimumValues() {
        List<Integer> integers = new ArrayList<>(List.of(20, 11, 1, 122, -1, 0));
        Integer max = integers.stream()
                .max((a, b) -> a.compareTo(b))
                .get();
        Integer min = integers.stream()
                .min((a, b) -> a.compareTo(b))
                .get();
        System.out.println("Maximum integer in a list : " + max);
        System.out.println("Minimum integer in a list : " + min);
    }


    public static void  smallestAndLargestElementsList() {
        List<Integer> numbers = Arrays.asList(7, 2, 5, 3, 9, 1, 4, 8, 6);
        Optional<Integer> secondSmallest = numbers.stream()
                .sorted()
                .distinct()
                .skip(1)
                .findFirst();
        Optional<Integer> secondLargest = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .distinct().
                skip(1)
                .findFirst();
        secondSmallest.ifPresent(s -> System.out.println("Second Smallest: " + s));
        secondLargest.ifPresent(s -> System.out.println("Second Largest: " + s));
    }

    public static void main(String[] args) {
        System.out.println("Write a Java 8 program to calculate the age of a person in years given their birthday.");
        calculatePersonAgeInYear();
        System.out.println();
        System.out.print("Write a Java 8 program to get the last element of an array.");
        lastElementInTheArray();
        System.out.println();
        System.out.println("Write a Java 8 program to print the first 10 odd numbers.");
        firstTenOddNumbers();
        System.out.println();
        System.out.println();
        System.out.println("Write a Java 8 program to generate the Fibonacci series.");
        generateFibonacciSeries();
        System.out.println();
        System.out.println("Write a Java 8 program to find the first non-repeated character in a string.");
        firstNonRepeatingCharacter();
        System.out.println();
        System.out.println("Write a Java 8 program to find the first repeated character in a string.");
        firstRepeatedCharacter();
        System.out.println();
        System.out.println("Write a Java 8 program to print the duplicate characters in a string.");
        duplicateCharactersInString();
        System.out.println();
        System.out.println("Write a Java 8 program to extract duplicate elements from an array.");
        extractDuplicateElements();
        System.out.println();
        System.out.println(
                "Given a list of strings, write a Java 8 program to find the strings that start with a number.");
        stringsStartsWithNumber();
        System.out.println();
        System.out.println(
                "Write a Java 8 program to check if a given string is a palindrome using the stream API and lambda expressions.");
        checkIsTheStringPalindrome();
        System.out.println();
        System.out.println("Write a Java 8 program to find the most repeated element in an array.");
        mostRepeatedElement();
        System.out.println("Write a Java 8 program to reverse an integer array.");
        reversedArray();
        System.out.println();
        System.out.println(
                " Write a Java 8 program to reverse each word of a given string using the stream API and lambda expressions");
        reverseEachWord();
        System.out.println();
        System.out.println(" Write a Java 8 program to find the common elements between two arrays using streams.");
        commonElements();
        System.out.println();
        System.out.println("Write a Java 8 program to find the sum and average of all elements in an integer array.");
        calculateAndSumAndAverage();
        System.out.println();
        System.out.println(
                "Write a Java 8 program to sort a given list of strings according to the increasing order of their length.");
        sortByLengthOfList();
        System.out.println();
        System.out.println("Write a Java 8 program to find the second-largest number in an integer array.");
        secondLargestNumberFromList();
        System.out.println();
        System.out.println("Write a Java 8 program to find the sum of all digits of a given number.");
        sumOf();
        System.out.println();
        System.out.println(
                "Write a Java 8 program to check if two strings are anagrams or not using the stream API and lambda expressions.");
        isAnagram();
        isAnagram2();
        System.out.println();
        System.out.println(
                "Write a Java 8 program to get the three maximum and three minimum numbers from a given list of integers.");
        min3max3();
        System.out.println();
        System.out.println(
                "Given a list of integers, write a Java 8 program to separate the odd and even numbers into two separate lists.");
        separationOfEvenOddNumberInMap();
        separationOfEvenOddNumberInList();
        System.out.println();
        System.out.println(
                "Write a Java 8 program to remove duplicate elements from a list using the stream API and lambda expressions.");
        removeDuplicateFromList();
        System.out.println();
        System.out.println(
                "Write a Java 8 program to find the frequency of each character in a given string using the stream API and collectors.");
        characterFrequency();

        System.out.println();
        System.out.println(
                "Write a Java 8 program to find the frequency of each element in an array or a list using streams and collectors.");
        wordFrequency();
        System.out.println();
        System.out.println("Write a Java 8 program to sort a given list of decimal numbers in reverse order.");
        reverseSortedList();
        System.out.println();
        System.out.println(
                "Given a list of strings, write a Java 8 program to join the strings with '[' as a prefix, ']' as a suffix, and ',' as a delimiter.");
        joinListOfStrings();
        System.out.println();
        System.out.println(
                "Write a Java 8 program to print the numbers from a given list of integers that are multiples of 5.");
        multipleOf5();
        System.out.println();
        System.out.println(
                "Given a list of integers, write a Java 8 program to find the maximum and minimum numbers in the list.");
        minMaxFromList();
        System.out.println();
        System.out.println(
                "Write a Java 8 program to merge two unsorted arrays into a single-sorted array using the stream API.");
        mergeUnsortedArrayIntoSorted();
        System.out.println();
        System.out.println(
                "Write a Java 8 program to merge two unsorted arrays into a single-sorted array without duplicates.");
        mergeUnsortedArrayIntoSortedWithoutDuplicate();
        System.out.println();
        System.out.println("Write a Java 8 program to find the sum of the first 10 natural numbers using streams.");
        sumOf10NaturalNumber();
        System.out.println("Write a Java 8 program to find theAverage of Integers.");
        averageOfIntegers();
        System.out.println("UpperCase And Lower Case");
        UpperCaseLowerCase();
        System.out.println("Calculate the sum of all even, odd numbers in a list using streams.");
        sumOfEvenOddNumbers();
        System.out.println("Remove all duplicate elements from a list using streams.");
        duplicateElements();
        System.out.println("Count the number of strings in a list that start with a specific letter using streams.");
        numberOfStrings();
        System.out.println("Sort a list of strings in alphabetical order ascending and descending using streams.");
        sortListAlphabeticalOrder();
        System.out.println("Find the maximum and minimum values in a list of integers using streams.");
        maximumAndMinimumValues();
        System.out.println("Find the second smallest and largest elements in a list of integers using streams.");
        smallestAndLargestElementsList();
        //Find the first element of a Stream in Java (Geeks for Geeks)
        List<String> strings = Arrays.asList("Geeks", "for", "Geeks", "is", "a", "DSA", "portal");
        Optional<String> firstElement = strings.stream().findFirst();
        //Check if the first element is present and print it
        firstElement.ifPresent(System.out::println);
        //        Given a list of strings,count the number of strings that have a length greater than 5.
        List<String> list = new ArrayList<>(List.of("he", "hello", "kiamotors", "helloworld", "hd"));
        long count = list.stream().filter(e -> e.length() > 5).count();
        System.out.println(count);
    }
}
