import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int a_point = 0;
        int b_point = A.length()-1;
        while(a_point < b_point){
            if(A.charAt(a_point) != A.charAt(b_point)){
                System.out.println("No");
                return;
            }
            a_point++;
            b_point--;
        }
        System.out.println("Yes");        
        
        
    }
}



