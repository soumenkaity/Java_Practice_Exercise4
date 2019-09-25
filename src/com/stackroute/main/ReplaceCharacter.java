package com.stackroute.main;

import java.util.Scanner;

public class ReplaceCharacter {
    public void characterReplace(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String input = scanner.nextLine();
        System.out.println("Result string after replacing : "+(input.replaceAll("d", "f").replaceAll("l", "t")));
    }
    public static void main(String[] args){
        ReplaceCharacter replaceCharacter = new ReplaceCharacter();
        replaceCharacter.characterReplace();
    }
}
