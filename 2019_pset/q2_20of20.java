package ccc_2019;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author William Law
 */
public class Main {
    
    public static boolean is_prime(int n) {
        boolean is_prime = true;
        double sqrt_n = Math.sqrt(n);
        
        for (int i = 2; i <= sqrt_n; i++) {
            if (n % i == 0) {
                is_prime = false;
                break;
            }            
        }

        return is_prime;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < T; i++) {
            int N = in.nextInt();            
            list.add(N);
        }

        for (Integer n : list) {
            for (int i = 2; i <= n; i++) {
                int diff = 0;

                if ((n * 2) % i != 0) {
                    diff = (n * 2) - i;

                    if (is_prime(diff) && is_prime(i)) {
                        System.out.print(i + " " + diff + "\n");
                        break;
                    }
                }
            }
        }
    }
}
