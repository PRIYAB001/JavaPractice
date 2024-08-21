package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class UniqueElementswithhashmap {
    public static void main(String args[]){
       Scanner sc =new Scanner(System.in);
       int n=sc.nextInt();
       int arr[]=new int[n];
       for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
       }
        HashMap<Integer,Integer> duplicateElement=new HashMap<Integer, Integer>();
       for(int i=0;i<n;i++) {
           duplicateElement.put(arr[i], i);
       }
        System.out.println(duplicateElement.keySet());
    }
}
