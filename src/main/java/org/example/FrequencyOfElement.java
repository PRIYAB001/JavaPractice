package org.example;

import java.util.Scanner;

public class FrequencyOfElement {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count;
        int a[]=new int[n];
        int f[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            count=1;
            for(int j=i+1;j<n;j++){
                  if(a[i]==a[j]) {
                      count++;
                  f[j]=-1;
                  }
            }
            if(f[i]!=-1){
                f[i]=count;
            }
        }
        for(int i=0;i<n;i++) {
            if (f[i] > 0) {
                System.out.println((a[i]) + " occurs "+ f[i]+" times ");
            }
        }

    }
}
