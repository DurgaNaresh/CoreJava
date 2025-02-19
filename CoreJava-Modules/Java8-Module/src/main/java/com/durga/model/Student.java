package com.durga.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author durganaresh on 2/19/25
 */
@Getter
@Setter
@AllArgsConstructor
@ToString
public class Student {
  private String firstName;
  private String lastName;
  private int age;
  private String gender;
  private String departmentName;
  private int joinedYear;
  private String city;
  private int rank;
}
