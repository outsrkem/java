package com.constructor;

public class StudentTest {
    /**
     * 调用构造器。
     * @param args
     */
    public static void main(String[] args) {
        Student S1 = new Student();
        S1.Print();
        System.out.println("************");
        Student S2 = new Student("tom", 19);
        S2.Print();
        System.out.println("************");
        Student S3 = new Student("tom", 19, "haiHua");
        S3.Print();
        System.out.println("************");
        Student S4 = new Student("tom", 19, "haiHua", "computer");
        S4.Print();
    }
}
