package ccc_2019;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author William Law
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        
        int[] measurements = new int[N];
        for (int i=0; i<N; i++) {
            measurements[i] = in.nextInt();
        }
        
        Arrays.sort(measurements);
        String rev_out = "";
        String n_out = "";
        if (N % 2 == 0) {
            for (int i=1; i<measurements.length/2+1; i++) {
                rev_out += measurements[measurements.length-i] + " " + measurements[i-1] + " ";
            }

            String[] out = rev_out.split("\\s+");
                        
            for (int i=1; i<out.length+1; i++) {
                n_out += out[out.length-i] + " ";
            }
        } else {
            for (int i=1; i<measurements.length/2+2; i++) {
                if (i == measurements.length) {
                    rev_out += measurements[i-1] + " ";
                    break;
                }
                rev_out += measurements[measurements.length-i] + " " + measurements[i-1] + " ";
            }
            
            String[] out = rev_out.split("\\s+");
            
            for (int i=1; i<out.length+1; i++) {
                n_out += out[out.length-i] + " ";
            }            
        }
        
        System.out.println(n_out);
    }
}