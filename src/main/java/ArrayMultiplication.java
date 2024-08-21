import java.util.Scanner;

public class ArrayMultiplication {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k = 0;
        int a;
        int product[] = new int[arr.length];
        for (int j = 0; j < arr.length; j++) {
            a = 1;
            for (int i = 0; i <= arr.length - 1; i++) {
                if (i != k) {
                    a *= arr[i];
                }
            }
            product[j] = a;
            k++;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(product[i]);
            if(i<arr.length-1){
                System.out.print("-");
            }
        }
    }
}
