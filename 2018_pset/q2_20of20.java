package ccc_2019;

import java.util.Scanner;

/**
 *
 * @author William Law
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        int[][] table = new int[N][N];

        // Create table
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                table[i][j] = in.nextInt();
            }
        }

        // Rotated 0/360
        if (table[0][0] < table[0][N - 1] && table[0][0] < table[N - 1][0]) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++)
                    System.out.print(table[i][j] + " ");
                System.out.println();
            }
        }
        // Rotated 90
        else if (table[0][0] > table[0][N - 1] && table[0][0] < table[N - 1][0]) {
            for (int i = N - 1; i >= 0; i--) {
                for (int j = 0; j < N; j++) {
                    System.out.print(table[j][i] + " ");
                }
                System.out.println();
            }
        }
        // Rotated 180
        else if (table[0][0] > table[0][N - 1] && table[0][0] > table[N - 1][0]) {
            for (int j = N - 1; j >= 0; j--) {
                for (int i = N - 1; i >= 0; i--) {
                    System.out.print(table[j][i] + " ");
                }
                System.out.println();
            }
        }
        // Rotated 270
        else if (table[0][0] < table[0][N - 1] && table[0][0] > table[N - 1][0]) {
            for (int i = 0; i < N; i++) {
                for (int j = N - 1; j >= 0; j--) {
                    System.out.print(table[j][i] + " ");
                }
                System.out.println();
            }
        }
    }
}