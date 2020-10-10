package com.example.demo;

import com.example.pojo.course;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class classTest {


    public static void main(String[] args) throws Exception{
        course course = new course("1111","ssd");
        Class<? extends com.example.pojo.course> aClass = course.getClass();

        Method getCourseId = aClass.getMethod("setCourseId",String.class);
        getCourseId.invoke(course,"22222");

        System.out.println(course.toString());

    }




}
