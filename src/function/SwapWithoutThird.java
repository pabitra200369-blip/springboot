package function;

import java.util.Scanner;

public class SwapWithoutThird {
    static void swap(int a , int b){
        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("a"+ a);
        System.out.println("b"+ b);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number a:");
        int a = sc.nextInt();
        System.out.println("enter number b:");
        int b = sc.nextInt();
        swap(a,b);
    }
}
