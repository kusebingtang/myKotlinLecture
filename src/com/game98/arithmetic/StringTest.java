package com.game98.arithmetic;

public class StringTest {

    public static void main(String[] args) {

        String s0 = new String("abc");//此语句产生几个String object

        String s1 = "abc";//此语句产生几个String object

        String s2 = new String("abc");//此语句产生几个String object

        String s3 = "abc";

        System.out.println(s0 == s1);//输出true or false
        System.out.println(s0 == s2);//输出true or false
        System.out.println(s1 == s2);//输出true or false
        System.out.println(s1 == s3);//输出true or false

        System.out.println(s1 == s0.intern());//输出true or false
        System.out.println(s1 == s1.intern());//输出true or false
        System.out.println(s1 == s2.intern());//输出true or false

        String hello = "hello";
        String hel = "hel";
        String lo = "lo";

        System.out.println(hello == "hel" + "lo");//输出true or false
        System.out.println(hello == "hel" + lo);//输出true or false
    }

}
