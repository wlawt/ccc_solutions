package ccc_2019;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author William Law
 */
public class Main {
    
       
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        
        for (int i = 0; i < 4; i++) {
            String line = in.nextLine();    
            String[] input = line.split("\\s+");
            
            for (String s : input) {
                nums.add(Integer.parseInt(s));
            }
        }
        
        // [8 9 10 16 x 20 24 x 30]
        for (int i = 0; i < 4; i++) {
            // i, i +3, i + 6
            // if any are X 
        }
        
    }
}
