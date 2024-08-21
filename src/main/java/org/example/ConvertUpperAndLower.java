package org.example;

import java.util.Scanner;

public class ConvertUpperAndLower {
    public static void main(String args[]) {
         Scanner sc=new Scanner(System.in);
         String word=sc.nextLine();
         StringBuffer word1=new StringBuffer(word);
         for(int i=0;i<word.length();i++){
             if(Character.isLowerCase(word.charAt(i))){
                 word1.setCharAt(i,Character.toUpperCase(word.charAt(i)));
             }
             else word1.setCharAt(i, Character.toLowerCase(word.charAt(i)));
         }
        System.out.println(word1);


    }
}
