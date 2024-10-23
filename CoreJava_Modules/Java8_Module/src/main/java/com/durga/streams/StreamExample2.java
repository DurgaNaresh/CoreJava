package com.durga.streams;

import com.durga.model.Student;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Durganaresh - 10/23/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class StreamExample2 {
    public static List<Student> students = List.of(
            new Student("Panku", "Yadav", 21, "male", "Accounts", 2021, "Delhi", 4),
            new Student("Ankit", "Kashyap", 22, "female", "IT", 2021, "Ranchi", 4),
            new Student("Deepu", "Mehra", 23, "male", "DM", 2021, "Bangalore", 8),
            new Student("Aakash", "Singh", 23, "female", "Owner", 2021, "Nasik", 4),
            new Student("Ankush", "Sharma", 27, "male", "Accounts", 2021, "Ratnagiri", 1)
    );

    public static void main(String[] args) {

        // Find list of students whose first name starts with the letter 'A'
        List<Student> studentsWithA = students.stream()
                .filter(student -> student.getFirstName().startsWith("A"))
                .toList();

        // Print the list of filtered students
        studentsWithA.forEach(System.out::println);

        // Find list of student's first name whose first name ends with alphabet u
        List<String> nameWithU = students.stream()
                .map(Student::getFirstName)
                .filter(firstName -> firstName.endsWith("u")).toList();

        nameWithU.forEach(System.out::println);

        //Find number of students for each department.
        Map<String, Long> studentsForEachDept = students.stream()
                .map(Student::getDepartmentName)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        studentsForEachDept.forEach((department, count) ->
                System.out.println("Department: " + department + ", Count: " + count)
        );

        //Find the student who is eldest.
        Student eldestStudent = students.stream()
                .max(Comparator.comparing(Student::getAge))
                .get();

        // find the student with the highest rank
        Student rankStudent = students.stream()
                .max(Comparator.comparing(Student::getRank))
                .get();

        System.out.println(eldestStudent.toString().toLowerCase());
        System.out.println(rankStudent);

        Map<String, Double> avgAgeBasedOnGender = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getGender,
                        Collectors.averagingInt(Student::getAge)
                ));

        avgAgeBasedOnGender.forEach((gender, averageAge) -> {
            System.out.println("Gender: " + gender + ", average age: " + averageAge);
        });

        // Find the department who is having maximum number of students
        Optional<Map.Entry<String, Long>> max = students.stream()
                .map(Student::getDepartmentName)
                .collect(
                        Collectors.groupingBy(
                                Function.identity(),
                                Collectors.counting()
                        )
                )
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue());

        System.out.println("Department: " + max.get().getKey() + ", count: " + max.get().getValue());

        // Find the Students who stays in fbd and sort them by their names
        List<Student> citySt = students.stream()
                .filter(s -> s.getCity().equalsIgnoreCase("fbd"))
                .sorted(Comparator.comparing(Student::getFirstName))
                .toList();

        citySt.forEach(System.out::println);

        // Find the highest rank in each department
        Map<String, Optional<Student>> highestRank = students.stream()
                .collect(
                        Collectors.groupingBy(
                                Student::getDepartmentName,
                                Collectors.maxBy(Comparator.comparing(Student::getRank))
                        )
                );
        System.out.println(highestRank.toString());
    }

}
