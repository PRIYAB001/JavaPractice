package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class OccurencesOfEachCharacter {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c;
        String word[]=new String[n];
        for(int i=0;i<n;i++){
            word[i]=sc.next();
        }
        System.out.println(Arrays.toString(word));
        for(int i=0;i<n;i++){
            c=1;
            for(int j=i+1;j<n;j++){
                if(word[i].equals(word[j])){
                    c++;
                }
            }
            System.out.println(word[i]+ " occurs at "+ c);


        }
    }
}

