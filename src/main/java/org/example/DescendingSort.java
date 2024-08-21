package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class DescendingSort {
         public static void main(String args[]){
             Scanner sc =new Scanner(System.in);
             int n=sc.nextInt();
             int a[]=new int[n];
             int temp;
             for(int i=0;i<n;i++){
                 a[i]=sc.nextInt();
             }
             for(int i=0;i<n;i++) {
                 for (int j = i+1; j < n; j++) {
                     if (a[i] < a[j]) {
                         temp = a[i];
                         a[i]=a[j];
                         a[j]=temp;
                     }
                 }
             }
             System.out.println(Arrays.toString(a));

         }
}
