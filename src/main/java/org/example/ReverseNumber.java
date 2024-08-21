package org.example;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int reverse,sum=0;
        while(n>0){
           reverse=n%10;
           sum=sum*10+reverse;
           n=n/10;
        }
        System.out.println(sum);
    }
}
