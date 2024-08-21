package org.example;

import java.util.Scanner;

public class LargestThreeNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int temp,largest;
        temp=a>b?a:b;
        largest=temp>c?temp:c;
        System.out.println(largest);


    }
}
