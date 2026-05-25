package function;

import java.util.Scanner;

public class StrongNumber {
    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++)
            fact *= i;

        return fact;
    }
    static boolean isStrong(int n) {
        int original = n;
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += factorial(digit);
            n /= 10;
        }
        return original == sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (isStrong(n))
            System.out.println("Strong Number");
        else
            System.out.println("Not Strong Number");
    }
}
