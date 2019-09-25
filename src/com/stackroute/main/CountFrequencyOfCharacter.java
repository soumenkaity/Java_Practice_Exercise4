package com.stackroute.main;

import java.util.Scanner;

public class CountFrequencyOfCharacter {
    public void countOccurences()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s = scanner.nextLine();
        System.out.println("Enter the character whose occurrences have to check ");
        String a = scanner.nextLine();
        System.out.println("Total occurrences of "+a.toLowerCase()+" is : "+(s.length()-s.toLowerCase().replaceAll(a.toLowerCase(),"").length()));
        //difference in lengths of both the strings gives the result;
    }
    public static void main(String[] args){
        CountFrequencyOfCharacter countFrequencyOfCharacter = new CountFrequencyOfCharacter();
        countFrequencyOfCharacter.countOccurences();
    }
}
