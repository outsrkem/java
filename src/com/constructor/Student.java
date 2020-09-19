package com.constructor;

/**
 * 构造器
 * 构造器重载
 * 赋值的顺序
 * 1.默认值
 * 2.显示赋值
 * 3.构造器赋值
 * 4.通过对象.方法，对象.属性赋值。
 */
public class Student {
    private String name = "abc";
    private int age;
    private String school;
    private String major;


    public Student() {
    }

    public Student(String n, int a) {
        name = n;
        age = a;
    }

    public Student(String n, int a, String s) {
        name = n;
        age = a;
        school = s;
    }

    public Student(String n, int a, String s, String m) {
        name = n;
        age = a;
        school = s;
        major = m;
    }

    public void Print() {
        System.out.println("name:" + name + " ; " + "age:" + age + " ; " + "school:" + school + " ; " + "major:" + major);

    }

}
