package org.example;

import java.util.Scanner;

public class WordOccurenceInString {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String word=sc.nextLine();
        char a[]=word.toCharArray();
        int f[]=new int[a.length];
        int c;
        for(int i=0;i<a.length;i++){
            c=1;
            for(int j=i+1;j<a.length;j++){
                if(word.charAt(i).equals(word.charAt(j))){
                    c++;
                    f[i]=-1;
                }
            }
           if(f[i]!=-1){
               f[i]=c;
           }
        }
        for(int k=0;k<f.length;k++){
            if(f[k]>0){
                System.out.println(a[k] + "occurs "+f[k]+ " times");
            }
        }
    }
}
