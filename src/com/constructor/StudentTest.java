package com.constructor;

public class StudentTest {
    public static void main(String[] args) {
        Student S1 = new Student();
        S1.Print();
        Student S2 = new Student("tom", 19);
        S2.Print();
    }
}
