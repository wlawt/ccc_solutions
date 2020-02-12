package ccc_2019;

import java.util.*;

public class Main {
        
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = Integer.parseInt(in.nextLine());
        ArrayList<Integer> Rs = new ArrayList<>();
        for (int i=0; i<N; i++) {
            Rs.add(Integer.parseInt(in.nextLine()));
        }
        
        HashMap<Integer, Integer> freq = new HashMap<>(); 
        for (int i=0; i<Rs.size(); i++) {
            freq.put(Rs.get(i), Collections.frequency(Rs, Rs.get(i)));
        }
        
        int num = 0;
        
        for (Integer i : freq.keySet()) {
            System.out.println(freq.get(i));
            if (freq.get(i) > 1) {
                num = Math.abs(i - Collections.max(freq.keySet()));
                break;
            }
        }
        
        System.out.println(num);
        // If: multiple of one num => Max - that multiple
        // If: both are multiple => get the greatest two => subtract 
        // Max - min
        
    }
}