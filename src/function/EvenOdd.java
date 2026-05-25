package function;

import java.util.Scanner;

public class EvenOdd {
    static void check(int n){
        if(n%2 == 0)
            System.out.println("even number");
        else
            System.out.println("odd number");
    }
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter a number:");
        int n = sc.nextInt();
        check(n);
    }
}
