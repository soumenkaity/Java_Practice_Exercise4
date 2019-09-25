package com.stackroute.main;

import java.util.Arrays;
import java.util.Scanner;

public class SortWords {
    public void wordSorting(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String paragraph = scanner.nextLine();
        if(paragraph==null){
            return;
        }
        String []required=paragraph.split("[\\s,.!?:;\"\'(){}\\[\\]]+");
        Arrays.sort(required);
        System.out.println("Sorted order of words : "+ Arrays.toString(required));
    }

    public static void main(String[] args) {
        SortWords sortWords = new SortWords();
        sortWords.wordSorting();
    }
}
