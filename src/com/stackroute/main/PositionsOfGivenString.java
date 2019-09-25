package com.stackroute.main;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PositionsOfGivenString {
    public void positionForOccurrencesOfString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String givenString = scanner.nextLine();
        System.out.println("Enter the string whose position of occurrences have to print : ");
        String inputString = scanner.nextLine();
        StringBuffer stringBuffer = new StringBuffer();
        Pattern pattern = Pattern.compile(inputString, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(givenString);
        while (matcher.find()) {
            stringBuffer.append("Found at: ").append(matcher.start()).append(" - ").append(matcher.end()).append("\n");
        }
        System.out.println(stringBuffer.toString().trim());
    }

    public static void main(String[] args) {
        PositionsOfGivenString positionsOfGivenString = new PositionsOfGivenString();
        positionsOfGivenString.positionForOccurrencesOfString();
    }
}
