package function;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PositiveNegative {
     static void check(int n){
        if(n<0)
            System.out.println("negative");
        else if(n>0)
         System.out.println("positive");
        else
            System.out.println("zero");
    }
    public static void main(String[] args){
         Scanner sc  = new Scanner(System.in);
        System.out.println("enter a number:");
        int n = sc.nextInt();
        check(n);
    }
}
