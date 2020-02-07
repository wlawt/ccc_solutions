/*

 */
package ccc_2019;

import java.util.Scanner;

/**
 *
 * @author William Law
 */
public class Main {

    public static void main(String[] args) {
        int[][] grid = new int[2][2];

        // [[1, 2], [3, 4]]
        grid[0][0] = 1;
        grid[0][1] = 2;
        grid[1][0] = 3;
        grid[1][1] = 4;

        Scanner in = new Scanner(System.in);
        String iter = in.nextLine();

        for (char c : iter.toCharArray()) {
            if (c == 'H') {
                int a = grid[0][0];
                grid[0][0] = grid[1][0];
                grid[1][0] = a;

                int b = grid[0][1];
                grid[0][1] = grid[1][1];
                grid[1][1] = b;
            } else {
                // V
                int a = grid[0][0];
                grid[0][0] = grid[0][1];
                grid[0][1] = a;

                int b = grid[1][0];
                grid[1][0] = grid[1][1];
                grid[1][1] = b;
            }
        }

        System.out.println("" + grid[0][0] + " " + grid[0][1] + "\n" + grid[1][0] + " " + grid[1][1]);
    }
}
