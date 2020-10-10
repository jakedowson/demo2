package com.interviewQuestions;
public class 两数之和 {
    public static void main(String[] args) {
        int[] number ={4,5,8};
        int i = number[0];
        System.out.println("i = " + i);
        int j;
        int target=12;
        for (i=0;i<number.length;i++) {
            for (j=i+1;j<number.length;j++){
                if(target==number[i]+number[j]){
                    System.out.println(i);
                    System.out.println(j);
                }
            }
        }
    }
}
