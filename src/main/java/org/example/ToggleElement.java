package org.example;

import java.util.Scanner;

public class ToggleElement {
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
           String word=sc.nextLine();
           String words[]=word.split("\\s");
        String third="";
           for(int i=0;i<words.length;i++){
               String first=words[i].substring(0,1);
               String  second=words[i].substring(1);
                third+=first.toLowerCase()+second.toUpperCase()+" ";

           }
           third.trim();
        System.out.println(third);
    }
}
