package function;

import java.util.Scanner;

public class PalindromeNum {
    static boolean ispalindome(int n){
        int  original = n;
        int rem;
        int rev = 0;
        while(n>0){
            rem = n%10;
            rev = rev*10+rem;
            n = n/10;
        }
        return original == rev;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        if(ispalindome(n))
            System.out.println("palindrome");
        else
            System.out.println("not palindrome");
    }
}
