package org.example;

import java.util.*;

public class MaximumAndMinimumCharacterInString {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String word=sc.nextLine();
        char a[]=word.toCharArray();
        int b[]=new int[a.length];
        char d ,f;
        d=f=a[0];
        ArrayList<Integer> sort1=new ArrayList<Integer>();
        for(int i=0;i<a.length;i++) {
            int count = 1;
            for (int j = i + 1; j < a.length; j++) {
                if(a[i]==a[j]){
                    count++;
                    b[j]=-1;
                }

            }
            if(b[i]!=-1){
                b[i]=count;
            }

        }
        int c,e;
        for(int k=1;k<b.length;k++){
            if(b[k]>0){

                e=c=b[0];
                if(c>b[k] ){
                    c=b[k];
                    d=a[k];
                }
                if(e<b[k]){
                    e=b[k];
                    f=a[k];
                }



            }
        }
        System.out.println("Minimum occuring character is " + d);
        System.out.println("Maximum occuring character is " + f);


    }
}
