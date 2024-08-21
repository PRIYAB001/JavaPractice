package org.example;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class StringRotation {
   public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       String word=sc.nextLine();
       String word1=sc.nextLine();
       String concat=word+word1;
       if(concat.contains(word1)){
           System.out.println("One string is rotation of another string");

       }
       else{
           System.out.println("One string is not rotation of another string");
       }
   }


}
