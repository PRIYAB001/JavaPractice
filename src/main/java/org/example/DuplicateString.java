package org.example;

import java.util.Scanner;


public class DuplicateString {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        char[] a=input.toCharArray();

        for(int i=0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    System.out.println(a[j]);
                    break;
                }
            }

        }
    }
}
