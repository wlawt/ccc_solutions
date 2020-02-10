package ccc_2019;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author William Law
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int K = in.nextInt();
        
        Stack<Integer> nums = new Stack<>();
        
        for (int i=0; i<K; i++) {
            int k_num = in.nextInt();
            
            if (k_num != 0) {
                nums.add(k_num);
            } else {
                nums.remove(nums.size()-1);
            }
        }
        
        int sum = 0;
        for (int i=0; i<nums.size(); i++) {
            sum += nums.get(i);
        }
        
        System.out.println(sum);
    }
}