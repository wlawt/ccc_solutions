package ccc_2019;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author William Law
 */
public class Main {
        
    static int getValue(int[] values, int rodLength) {
        int[] subSolutions = new int[rodLength +1];
        
        for (int i = 1; i <= rodLength; i++) {
            int tmpMax = -1;
            for(int j = 0; j < i; j++) {
                tmpMax = Math.max(tmpMax, values[j] + subSolutions[i-j-1]);
            }
            subSolutions[i] = tmpMax;
        }
        
        return subSolutions[rodLength];
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String n_k = in.nextLine();
        String[] s_n_k = n_k.split("\\s+");
        int N = Integer.parseInt(s_n_k[0]); 
        int K = Integer.parseInt(s_n_k[1]); 

        System.out.println(N);
        System.out.println(K);
        
        /*
        int[] input = new int[N];
        for (int i=0; i<N; i++) {
            input[i] = in.nextInt();
        }
        
        ArrayList<Integer> computed = new ArrayList<>();
        int sum, tmp = 0;
        int n_sol = input.length / K;
        
        for (int i=0; i<n_sol; i++) {
            if (input[i] > tmp) {
                tmp = input[i];
            }
        }
        */
        
        ArrayList<Integer> input = new ArrayList<>();
        String s_input = in.nextLine();
        String[] ss_input = s_input.split("\\s+");
                
        for(int i=0; i<N; i++) 
            input.add(Integer.parseInt(ss_input[i]));
        
        Collections.sort(input);
        int sum = input.get(input.size()-1) + input.get(input.size()-2);
        
        System.out.println(sum);
        
    }
}
