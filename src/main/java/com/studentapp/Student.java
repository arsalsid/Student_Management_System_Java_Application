package com.studentapp;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student {

    private String name;
    private int age;
    private String studentId;
    private List<String> courses;

    public Student(String name, int age, String student_Id) {
        super();
        if (validateAge(age) && validateName(name) && validateStudentId(student_Id)) {
            this.name = name;
            this.age = age;
            this.studentId = student_Id;
            courses = new ArrayList<String>(); //Initialization of courses;
        }
    }

    public void enrollCourse(String course) {
        if (courses.contains(course)) {
            System.err.println("Student is already enroll to the Course" +course);
        }
        courses.add(course);
        System.out.println("Student is Enroll to " + course + " successfully!!");
    }

    public void printStudentInfo() {
        System.out.println("==========Student Information========");
        System.out.println("Student Name: " +name);
        System.out.println("Student Age: " +age);
        System.out.println("Student Id: " +studentId);
        System.out.println("Enrolled For: " +courses);
    }

    @Override
    public String toString() {
        return "Student: [name= " + name + ", age= " + age + ", studentId= " + studentId + ", courses= " + courses + "]";
    }

    //Validation method(Age)
    public boolean validateAge(int age) {
        if (age >= 19 && age<= 35 ) {
            return true;
        }
        else {
            System.err.println("Invalid Age!!! Student Age needs to be between 19 and 35");
            return false;
        }
    }

    //validate(Name)
    public boolean validateName(String name) {
        //^ sign indicates that string needs to start and alphabet
        String nameRegex = "^[a-zA-Z\\s]+$";
        Pattern patternName = Pattern.compile(nameRegex);
        Matcher matcherName = patternName.matcher(name);
        if (matcherName.matches()) {

            return true;
        }
        else {
            System.err.println("Invalid Name!!! Please enter alphabets only");
            return false;
        }
    }

    public boolean validateStudentId(String studentId) {

        String studentIdRegex = "S-\\d+$"; //S-123
        Pattern studentIdPattern = Pattern.compile(studentIdRegex);
        Matcher studentIdMatcher = studentIdPattern.matcher(studentId);
        if (studentIdMatcher.matches()) {
            return true;
        }
        else {
            System.err.println("Invalid Student Id... Use the format Eg... S-123");
        }
        return false;

    }
}
