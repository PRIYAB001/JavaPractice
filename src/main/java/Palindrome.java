import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int lastDigit;
         int temp=n;
         while(n>0) {
             lastDigit = n % 10;
             sum = sum * 10 + lastDigit;
             n = n / 10;
         }
        if (temp == sum) {
            System.out.println("given number is palindrome");
        }
        else{
            System.out.println("Given number is not palindrome");
        }
    }
}

