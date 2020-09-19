package com.constructor;

/**
 * 构造器
 * 构造器重载
 *
 */
public class Student {
    private String name;
    private int age;
    private String school;
    private String major;

    public Student(){
    }
    public Student(String n, int a){
        name = n;
        age = a;
    }
    public Student(String n, int a, String s){
        name = n;
        age = a;
        school = s;
    }
    public Student(String n, int a, String s, String m){
        name = n;
        age = a;
        school = s;
        major = m;
    }

    public void  Print (){
        System.out.println(name);
        System.out.println(age);
        System.out.println(school);
        System.out.println(major);

    }

}
