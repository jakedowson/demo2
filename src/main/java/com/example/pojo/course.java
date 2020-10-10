package com.example.pojo;

import sun.net.idn.Punycode;

public class course {

    String courseId;
    String courseName;


    public course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }


    public static void call(String s){
        System.out.println(s);
    }


    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }


    @Override
    public String toString() {
        return "course{" +
                "courseId='" + courseId + '\'' +
                ", courseName='" + courseName + '\'' +
                '}';
    }
}
