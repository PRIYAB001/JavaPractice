package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String word=sc.nextLine();
        String word1=sc.nextLine();
        word.toLowerCase();
        word1.toLowerCase();
        char a[]=word.toCharArray();
        char b[]=word1.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        String word3=String.copyValueOf(a);
        String word4=String.copyValueOf(b);
        System.out.println(word3);
        System.out.println(word4);
        if(word3.equals(word4)){
            System.out.println("Given string are anagram");
        }
        else{
            System.out.println("Given string are not anagram");
        }
    }
}
