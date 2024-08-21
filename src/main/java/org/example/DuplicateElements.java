package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateElements {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                System.out.println(arr[i+1]);
            }

        }
    }
}
