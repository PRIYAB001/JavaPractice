package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotate {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=sc.nextInt();
        int arr[]=new int[n1];
        for(int i=0;i<n1;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int first=arr[0];
              for (int j=0;j<n1-1;j++) {
                  arr[j]=arr[j+1];
              }
              arr[n1-1]=first;

        }
        System.out.println(Arrays.toString(arr));
    }
}
