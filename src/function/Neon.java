package function;

import java.util.Scanner;

public class Neon {
    static boolean isNeon(int n) {
        int square = n * n;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (isNeon(n))
            System.out.println("Neon Number");
        else
            System.out.println("Not Neon Number");
    }
}
