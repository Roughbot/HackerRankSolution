import java.io.*;
import java.util.*;

public class Solution {

    /* compareing the lasgest lexicographically larger string */
    public static void compare(String a,String b){
            int rst = a.compareTo(b);
            if (rst > 0){
                System.out.println("Yes");
            }else if (rst < 0){
                System.out.println("No");
            }
            else{
                System.out.println("No");
            }
        }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        
        /* Converting the first letter of the stiring to caps*/
        String At = A.substring(0,1).toUpperCase() + A.substring(1);
        String Bt = B.substring(0,1).toUpperCase() + B.substring(1);
        
        System.out.println(A.length()+B.length());
        compare(A,B);
        System.out.println(At+ " " +Bt);
        sc.close();
    }
}



