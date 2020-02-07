package ccc_2019;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author William Law
 */
public class Main {
           
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // Get n input
        int N = in.nextInt();
        int[][] table = new int[N][N];
        
        // Fill table
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                table[i][j] = in.nextInt();
        
        /*
            Properties
                a < last_term_same_row
                a < last_term_same_column
                last_column_value < last_term_column_value
        */
        
        // rotated 0/360
        if (table[0][0] < table[0][N-1] && table[0][0] < table[N-1][0]) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++)
                    System.out.print(table[i][j] + " ");
                System.out.println("");
            }
        // rotated 90
        } else if (table[0][0] > table[0][N-1] && table[0][0] < table[N-1][0]) {
            
        // rotated 180
        } else if (table[0][0] > table[0][N-1] && table[0][0] > table[N-1][0]) {
            
        // rotated 270
        } else if (table[0][0] < table[0][N-1] && table[0][0] > table[N-1][0]) {
            
        }
    }
}
