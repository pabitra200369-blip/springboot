package function;

import java.util.Scanner;

public class Fibonacci {
    static void fibonacci(int n){
        int a = 0; int b = 1;
        for(int i = 1; i<=n; i++){
            System.out.println(a+"");
            int c  =  a+b;
            a = b;
            b = c;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibonacci(n);
    }
}
