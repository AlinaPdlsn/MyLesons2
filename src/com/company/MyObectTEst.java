package com.company;

public class MyObectTEst {

    public static void main(String[] args) {
        MyObject myFirstObject = new MyObject();
        myFirstObject.number = 10;
        myFirstObject.text = "text1";

        // Shift + F6
        MyObject mySecondObject = new MyObject();
        mySecondObject.number = 20;
        mySecondObject.text = "text2";

        //ctrl +D
        System.out.printf("myFirstObject: number=%d, text=%s\n",myFirstObject.number, myFirstObject.text);
        System.out.printf("mySecondObject: number=%d, text=%s\n",mySecondObject.number, mySecondObject.text);


