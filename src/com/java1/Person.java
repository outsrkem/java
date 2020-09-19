package com.java1;

/**
 * this 关键字的使用
 * 可以理解"this"为当前对象。
 * 通常情况下都省略"this.",如果形参与变量重名，则需要加上"this.",表明这是一个属性。
 */
public class Person {
    private String name;
    private int age;

    public Person() {
        String info = "构造器初始化的40行代码。。。";
        System.out.println(info);
    }

    public Person(String name) { //构造器中使用
        this();  // 规定:这个'this' 必须放着首行。
        this.name = name;
    }

    public Person(String name, int age) { //构造器中使用
        this(name);
        this.age = age;
    }

    public void setName(String name) {//方法中使用
        /**
         * this.name = name;    这个this.name，代表是上面定义的name属性、
         * name = name;         如果不加this，则name是代表形参的name。
         *
         */
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
