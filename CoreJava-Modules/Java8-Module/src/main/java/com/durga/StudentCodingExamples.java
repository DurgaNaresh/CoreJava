package com.durga;

import com.durga.model.Student;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author durganaresh on 2/19/25
 */
public class StudentCodingExamples {
  static List<Student> students =
      List.of(
          new Student("Panku", "Yadav", 21, "male", "Accounts", 2021, "Delhi", 4),
          new Student("Ankit", "Kashyap", 22, "female", "IT", 2021, "Ranchi", 4),
          new Student("Deepu", "Mehra", 23, "male", "DM", 2021, "Bangalore", 8),
          new Student("Aakash", "Singh", 23, "female", "Owner", 2021, "Nasik", 4),
          new Student("Ankush", "Sharma", 27, "male", "Accounts", 2021, "Ratnagiri", 1));


  public static void main(String[] args) {
    findStudentsFirstNameStartsWithA();
    findListStudentFirstNameEndsWithU();
    findNumberOfStudentsForEachDepartment();
    findStudentEldestAndHighestRank();
    avgAgeBasedOnGender();
    findTheHighestRankInEachDepartment();
    findDepartmentWhoHavingMaximumNumberOfStudents();
    findStudentsWhoStaysInFbdAndSortThemByNames();
  }

  public static void findStudentsFirstNameStartsWithA() {
    System.out.println("Find list of students whose first name starts with the letter 'A'");
    System.out.println("-----------------------------------------------------------------");
    List<Student> studentsWithA =
        students.stream().filter(student -> student.getFirstName().startsWith("A")).toList();
    studentsWithA.forEach(System.out::println);
  }

  public static void findListStudentFirstNameEndsWithU() {
    System.out.println("Find list of student's first name whose first name ends with alphabet 'U'");
    System.out.println("-------------------------------------------------------------------------");
    List<String> nameWithU =
        students.stream()
            .map(Student::getFirstName)
            .filter(firstName -> firstName.endsWith("u"))
            .toList();

    nameWithU.forEach(System.out::println);
  }

  public static void findNumberOfStudentsForEachDepartment() {
    System.out.println("Find number of students for each department.");
    System.out.println("---------------------------------------------");
    Map<String, Long> studentsForEachDept =
        students.stream()
            .map(Student::getDepartmentName)
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

    studentsForEachDept.forEach(
        (department, count) ->
            System.out.println("Department: " + department + ", Count: " + count));
  }

  public static void findStudentEldestAndHighestRank() {
    System.out.println("Find the student who is eldest");
    System.out.println("-------------------------------");
    Student eldestStudent = students.stream().max(Comparator.comparing(Student::getAge)).get();

    System.out.println("Find the student with the highest rank");
    System.out.println("--------------------------------------");
    Student rankStudent = students.stream().max(Comparator.comparing(Student::getRank)).get();

    System.out.println(eldestStudent);
    System.out.println(rankStudent);
  }

  public static void avgAgeBasedOnGender() {
    System.out.println("Average Age Based On Gender");
    System.out.println("----------------------------");
    Map<String, Double> avgAgeBasedOnGender =
        students.stream()
            .collect(
                Collectors.groupingBy(
                    Student::getGender, Collectors.averagingInt(Student::getAge)));

    avgAgeBasedOnGender.forEach(
        (gender, averageAge) -> {
          System.out.println("Gender: " + gender + ", average age: " + averageAge);
        });
  }

  public static void findTheHighestRankInEachDepartment() {
    System.out.println("Find the highest rank in each department");
    System.out.println("----------------------------------------");
    // Find the highest rank in each department
    Map<String, Optional<Student>> highestRank =
        students.stream()
            .collect(
                Collectors.groupingBy(
                    Student::getDepartmentName,
                    Collectors.maxBy(Comparator.comparing(Student::getRank))));
    highestRank.forEach(
        (department, rank) -> {
          System.out.println("Department: " + department + ", rank: " + rank);
        });
  }

  public static void findDepartmentWhoHavingMaximumNumberOfStudents() {
    System.out.println("Find the department who is having maximum number of students");
    System.out.println("------------------------------------------------------------");
    Optional<Map.Entry<String, Long>> max =
        students.stream()
            .map(Student::getDepartmentName)
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
            .entrySet()
            .stream()
            .max(Map.Entry.comparingByValue());

    System.out.println("Department: " + max.get().getKey() + ", count: " + max.get().getValue());
  }

  public static void findStudentsWhoStaysInFbdAndSortThemByNames() {
    List<Student> students = List.of(
        new Student("Panku", "Yadav", 21, "male", "Accounts", 2021, "fbd", 4),
        new Student("Ankit", "Kashyap", 22, "male", "IT", 2021, "fbd", 4),
        new Student("Deepu", "Mehra", 23, "male", "DM", 2021, "Bangalore", 8),
        new Student("Aakash", "Singh", 23, "male", "Owner", 2021, "fbd", 4),
        new Student("Anshu", "mishra", 27, "male", "Accounts", 2021, "fbd", 1)
    );
    System.out.println("Find the Students who stays in fbd and sort them by their names");
    System.out.println("----------------------------------------------------------------");
    List<Student> citySt =
        students.stream()
            .filter(s -> s.getCity().equalsIgnoreCase("fbd"))
            .sorted(Comparator.comparing(Student::getFirstName))
            .toList();

    citySt.forEach(System.out::println);
  }
}
