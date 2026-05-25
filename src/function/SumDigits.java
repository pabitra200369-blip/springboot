package function;

import java.util.Scanner;

public class SumDigits {
    static int sum(int n){
        int s  = 0;
        int rem;
        while (n > 0) {
            rem  = n%10;
            s = s+rem;
            n = n/10;
        }
        return s;
    }
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int  n = sc.nextInt();
        System.out.println("sum="+sum(n));
    }
}
