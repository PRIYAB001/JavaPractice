package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class RotateElement {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = sc.nextInt();
        int arr[] = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int last = arr[arr.length - 1];
            System.out.println(last);
            for (int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];

            }
            arr[0] = last;
        }

        System.out.println(Arrays.toString(arr));
    }
}
