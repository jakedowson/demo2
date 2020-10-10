package com.example.demo;

import org.omg.CORBA.OMGVMCID;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class URL_test {


    public static void main(String[] args) {


        try {
            URL url = new URL("https://www.baidu.com");
            int count=0;
            Scanner input = new Scanner(url.openStream());
            while (input.hasNext()){
                String s = input.nextLine();
                System.out.println(s);
                count+=s.length();
            }

            System.out.println(count);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
