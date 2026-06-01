package function;

import java.util.Scanner;

public class ArmStrong {
    static boolean isarmstrong(int n){
        int original = n;
        int sum = 0;
        while(n>0){
            int digit = n%10;
            sum = sum+digit*digit*digit;
            n = n/10;
        }
        return original == sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isarmstrong(n))
            System.out.println("armstrong");
        else
            System.out.println("not armstrong");
    }

}
