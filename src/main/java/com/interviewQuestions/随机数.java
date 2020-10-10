package com.interviewQuestions;

import java.util.Random;

public class 随机数 {


    public static void main(String[] args) {
        Random random = new Random();


        int i = random.nextInt(100);
        System.out.println("i = " + i);


    }
}
