/* 
    Confirmation/solution from https://github.com/johnafish/CCC-Solutions/blob/master/2012/Senior/S1.py
 */

import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int J = Integer.parseInt(in.nextLine())-1;
        
        System.out.println((J*(J-1)*(J-2))/6);
    }
}