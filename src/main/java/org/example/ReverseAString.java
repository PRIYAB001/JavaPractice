package org.example;

import java.util.Scanner;

public class ReverseAString {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String word=sc.nextLine();
        char[] a=word.toCharArray();
        String b="";
        for(int i=a.length-1;i>=0;i--){
            b+=a[i];
        }
        System.out.println(b);
    }
}
