package ccc_2019;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author William Law
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();

        int[] list = new int[T];

        for (int i = 0; i < T; i++) {
            int N = in.nextInt();
            list[i] = N;
        }

        Arrays.sort(list);

        double[] midpoints = new double[T - 1];
        for (int i = 0; i < list.length - 1; i++) {
            midpoints[i] = (list[i + 1] + list[i]) / 2.0;
        }

        double[] distance = new double[midpoints.length - 1];
        for (int i = 0; i < midpoints.length - 1; i++) {
            distance[i] = Math.abs(midpoints[i + 1] - midpoints[i]);
        }

        Arrays.sort(distance);

        System.out.println(String.format("%.1f", distance[0]));

    }
}