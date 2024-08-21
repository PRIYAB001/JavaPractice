package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicateInArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int temp[]=new int[n];
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int j=0;
      for(int i=0;i<n-1;i++){
            if(arr[i]!=arr[i+1]){
                temp[j++]=arr[i];
            }
      }
      temp[j++]=arr[n-1];
        System.out.println(j);
        System.out.println(Arrays.toString(temp));
      for(int i=0;i<j;i++){
          arr[i]=temp[i];
          System.out.print(arr[i]+ " ");
      }
    }
}
