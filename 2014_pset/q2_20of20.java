package ccc_2019;

import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = Integer.parseInt(in.nextLine());
        
        StringTokenizer first = new StringTokenizer(in.nextLine());
        StringTokenizer second = new StringTokenizer(in.nextLine());
        
        ArrayList<String> pairs_found = new ArrayList<>();
        String state = "good";
        
        while(first.hasMoreTokens()) {
            String first_person = first.nextToken();
            String second_person = second.nextToken();
            
            // Same person
            if (first_person.equals(second_person)) {
                state = "bad";
            } 
            
            List<String> sorted_by_alpha = new ArrayList<>();
            sorted_by_alpha.add(first_person);
            sorted_by_alpha.add(second_person);
            Collections.sort(sorted_by_alpha);
            
            pairs_found.add(sorted_by_alpha.get(0) + " " + sorted_by_alpha.get(1));
        }
        
        Set<String> no_duplicates = new HashSet<>();
        no_duplicates.addAll(pairs_found); // Only adds unique values
        
        // Should be half in size
        if (no_duplicates.size() != (N/2)) {
            state = "bad";
        }
        
        System.out.println(state);
    }
}