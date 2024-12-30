package com.studentapp;

public class Main {
    public static void main(String[] args) {
        System.out.println("*******Student Management System*******");
        System.out.println("*******Welcome*******");

        Student s1; //reference variable & stores unique identification
        s1 = new Student("Moazzam",20,"S-245");
        s1.enrollCourse("Java");
        s1.enrollCourse("Java");
        s1.enrollCourse("Java");
        s1.enrollCourse("Java");
        System.out.println(s1);
    }
}