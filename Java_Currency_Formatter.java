import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double srt = scanner.nextDouble();
        scanner.close();
        
        
        String us = NumberFormat.getCurrencyInstance(Locale.US).format(srt);
        String ind = NumberFormat.getCurrencyInstance(new Locale("en","in")).format(srt);      
        String chi = NumberFormat.getCurrencyInstance(Locale.CHINA).format(srt);
        String fra = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(srt);
        
        
        System.out.println("US: "+ us);
        System.out.println("India: "+ ind);
        System.out.println("China: "+ chi);
        System.out.println("France: "+ fra);
        
    }
}
