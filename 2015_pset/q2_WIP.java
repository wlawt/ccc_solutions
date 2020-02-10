package ccc_2019;

import java.util.Scanner;
import java.util.HashMap;
import java.lang.Character;
import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int J = in.nextInt();
        int A = in.nextInt();
        
        char[] j = new char[J];
        for (int i=0; i<J; i++) {
            j[i] = in.nextLine().charAt(0);
        }
        
        HashMap<String, Integer> a = new HashMap<String, Integer>();
        String s = "";
        for (int i=0; i<A; i++) {
            s = in.nextLine();
            String[] _s = s.split("\\s+");
            
            a.put(_s[0], Integer.parseInt(_s[1]));
        }
        
        int counter = 0;
        String[] sizes = new String[]{"S", "M", "L"};
        for (int i=0; i<j.length; i++) {
            try {
                String _str = Character.toString(j[i]);
                
                if (a.get(_str) != null && i == a.get(_str)) {
                    counter++;              
                } 
            } catch (IndexOutOfBoundsException e) {
                break;
            }
            // DNE or != curr -> continue
            
            // params
                // does the i-value even have a hashmap mapping?
                // does that i-value match the hashmap integer?
                // does the size of the i-value match or > hashmap string
        }
        
        System.out.println(counter);
    }
}