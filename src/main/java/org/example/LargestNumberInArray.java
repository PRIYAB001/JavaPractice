package org.example;

import java.util.Scanner;

public class LargestNumberInArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int temp=a[0];
        for(int i=1;i<n;i++){
            if(temp<a[i]){
                temp=a[i];
            }
        }
        System.out.println(temp);
    }
}
