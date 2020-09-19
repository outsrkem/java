package com.java1;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("lis");
        p1.setAge(19);
        System.out.println(p1.getName() + " , " + p1.getAge());
        System.out.println("++++++++++++++");

        Person p2 = new Person("zhangsan", 20);
        System.out.println("name:" + p2.getName());

    }
}
