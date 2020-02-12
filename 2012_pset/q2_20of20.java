package ccc_2019;

import java.util.*;

public class Main {
        
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        HashMap<String, Integer> roman_numeral = new HashMap<>();
        roman_numeral.put("I", 1);
        roman_numeral.put("V", 5);
        roman_numeral.put("X", 10);
        roman_numeral.put("L", 50);
        roman_numeral.put("C", 100);
        roman_numeral.put("D", 500);
        roman_numeral.put("M", 1000);
        
        String[] symbols = in.nextLine().split("");
        
        int aromatic = 0;
        
        ArrayList<Integer> arabic = new ArrayList<>();
        ArrayList<Integer> roman = new ArrayList<>();
        for (int i=0; i<symbols.length; i++) {
            try {
                int elem = Integer.parseInt(symbols[i]);
                arabic.add(elem);
            } catch (NumberFormatException e) {
                int elem = roman_numeral.get(symbols[i]);
                roman.add(elem);
            }
        }
                
        for (int i=0; i<arabic.size()+2; i++) {
            try {
                if (roman.get(i+1) > roman.get(i)) {
                   aromatic -= arabic.get(i) * roman.get(i);
                } else {
                   aromatic += arabic.get(i) * roman.get(i);
                }   
            } catch (IndexOutOfBoundsException e) {
                continue;
            }
        }
             
        aromatic += arabic.get(arabic.size()-1) * roman.get(roman.size()-1);
       
        System.out.println(aromatic);
    }
}