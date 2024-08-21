package org.example;

import java.util.Scanner;

public class StringPalindrome {
    public String palindrome(String word1) {
        String rev;
        String r="";
        int c=0;
        String a[] = word1.split(" ");
        for (int i = 0; i < a.length; i++) {
            rev="";
            c=0;
            String b = a[i];

            char d[]=b.toCharArray();
              for (int j =d.length-1 ; j>=0; j--) {
                  rev = rev + d[j];

              }
                if (b.equals(rev)) {
                int count = b.length();
                if(count>c){
                    c=count;
                }
            }

        }
        for(int i=0;i<a.length;i++) {
            if (a[i].length() == c) {
                System.out.println(a[i]);
            }
        }
        return r;
    }

        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            String word1=sc.nextLine();
            StringPalindrome a=new StringPalindrome();
            a.palindrome(word1);
            System.out.println( a.palindrome(word1));


    }

}
