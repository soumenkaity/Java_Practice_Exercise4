package com.stackroute.main;

import java.util.Scanner;

public class StringTranspose {
    public void transpose()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s = scanner.nextLine();
        String[] arr;
        String result="";
        arr=s.split(" ");  // stores the words in a array
        for(String a:arr)
        {
            StringBuilder sb=new StringBuilder(a);
            sb=sb.reverse();//reverse each word
            result=result.concat(sb.toString()).concat(" ");

        }
        System.out.println("Result String after transpose : "+result.trim());
    }

    public static void main(String[] args) {
        StringTranspose stringTranspose = new StringTranspose();
        stringTranspose.transpose();
    }
}
