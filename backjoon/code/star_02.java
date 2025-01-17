package complete;

import java.util.Scanner;

public class star_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++) {
            System.out.print(" ".repeat(n-i)); // n-i개
            if(i == 1) {
                System.out.println("*");
            } else if (i == 2) {
                System.out.println("***");
            } else {
                System.out.println("*".repeat(2*i-1)); // 2×N-1 개
            }
        }

        for(int i=n; i>1; i--) {
            System.out.print(" ".repeat(n+1-i)); // n-i개
            if(i == 2) {
                System.out.println("*");
            } else if (i == 3) {
                System.out.println("***");
            } else {
                System.out.println("*".repeat(2*(i-1)-1)); // 2×N-1 개
            }
        }
    }
}
