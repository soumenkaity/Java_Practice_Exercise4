package com.stackroute.main;

import java.util.Scanner;

public class FindHarry {
    public void isHarryHere(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String input = scanner.nextLine();
        System.out.println("Is Harry here? "+input.matches("(?i).*Harry.*"));
    }

    public static void main(String[] args) {
        FindHarry findHarry = new FindHarry();
        findHarry.isHarryHere();
    }
}
