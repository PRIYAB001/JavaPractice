package org.example;

import java.util.Scanner;

public class SwapingAStrirng {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();
        String word3=word1.replaceAll(" ","");
        System.out.println(word3);
        System.out.println("Before swapping " + word1 + "    " + word2);

        word1 = word1 + word2;
        word2 = word1.substring(0, word1.length() - word2.length());
        word1 = word1.substring(word2.length());
        System.out.println("After swapping " + word1 + "    " + word2);


    }
}
