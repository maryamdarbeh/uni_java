
package javaapplication4;

import java.util.Scanner;

public class JavaApplication4{
    public static double calculateDistance(int i, int j, int iMid, int jMid) {
        return Math.sqrt(Math.pow(i - iMid, 2) + Math.pow(j - jMid, 2));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = scanner.nextInt();
        System.out.println("Enter m:");
        int m = scanner.nextInt();

        if (m % 2 == 0 || n % 2 == 0) {
            System.out.println("Invalid dimensions! Both n and m must be odd.");
            return;
        }

        int[][] a = new int[n][m];
        int iMid = n / 2;
        int jMid = m / 2;

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Central element: " + a[iMid][jMid]);
        System.out.println("Distances from central element:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                double distance = calculateDistance(i, j, iMid, jMid);
                System.out.println(distance);
            }
        }
    }
}
