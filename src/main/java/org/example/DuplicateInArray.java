package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DuplicateInArray {
    public static void main(String args[]){
                Scanner sc=new Scanner(System.in);
                int n=sc.nextInt();
                int a[]=new int[n];
        List<Integer> d= new ArrayList<Integer>();
                for(int i=0;i<n;i++){
                    a[i]=sc.nextInt();
                }
                for(int i=0;i<n;i++){
                      for(int j=i+1;j<n;j++){
                          if(a[i]==a[j]){
                             if(d.contains(a[i])){
                                 break;
                             }
                             else {
                                 d.add(a[j]);
                             }
                          }


                      }
                }
        System.out.println(d);
    }
}
