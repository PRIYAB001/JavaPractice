import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        int temp=n;
        int r=0;
        while(temp>0){
            temp=temp/10;
            count++;
        }
        temp=n;

        while(temp>0){
           int last=temp%10;
            r= (int) (r+(Math.pow(last,count)));
            temp=temp/10;

        }
        if(r==n){
            System.out.println("given number is a armstrong number");
        }
        else{
            System.out.println("Given number is not armstrong number");
        }
    }
}
