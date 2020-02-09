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
        int N = in.nextInt();
        
        int[][] scores = new int[2][N];
        
        for (int i=0; i<2; i++) {
            for (int j=0; j<N; j++) {
                scores[i][j] = in.nextInt();
            }
        }
        
        int t1 = 0, t2 = 0, counter = 1;
        ArrayList<Integer> found_at = new ArrayList<>();
        found_at.add(0);
        for (int i=0; i<N; i++) {
            t1 += scores[0][i];
            t2 += scores[1][i];
            
            if (t1 == t2) {
                found_at.add(counter);
            }
            
            counter++;
        }
        
        if (found_at.size() == 1) {
            System.out.println(0);
        } else {
            Collections.sort(found_at);
            System.out.println(found_at.get(found_at.size()-1));          
        }        
    }
}