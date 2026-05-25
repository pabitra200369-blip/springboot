package function;

import java.util.Scanner;

public class SpyNumber {
    static boolean isSpy(int n) {
        int sum = 0, product = 1;
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n /= 10;
        }
        return sum == product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (isSpy(n))
            System.out.println("Spy Number");
        else
            System.out.println("Not Spy Number");
    }
}
