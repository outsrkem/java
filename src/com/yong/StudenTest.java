package com.yong;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import javax.xml.transform.stream.StreamSource;

public class StudenTest {
    public static void main(String[] args) {
        Student[] stus = new Student[20];
        for(int i = 0; i < stus.length; i++){
//            给数组元素赋值
            stus[i] = new Student();
//            给对象赋值
            stus[i].number = (i + 1);
            stus[i].state = (int)(Math.random() * (6 - 1 + 1) + 1);
            stus[i].score = (int)(Math.random() * (100 - 0 + 1));
        }

        for (int i = 0; i < stus.length; i++){
//            System.out.println(stus[i].number);
            System.out.println(stus[i].info());
        }

        System.out.println("三年级的学生信息如下：");
        for (int i = 0; i < stus.length; i++){
            if(stus[i].state == 3){
                System.out.println(stus[i].info());
            }


        }
    }
}

