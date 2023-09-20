import java.util.*;

public class Java_String_Tokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        //removing the spaces both in front and back of the string
        s = s.trim();
        if (s.isEmpty()){
            System.out.println(0);
            return;
        }
        //removing the special characters
        String[] letter = s.split("[ !,?._'@]+");
        System.out.println(letter.length);
       for(String a : letter){
            System.out.println(a);
        }
        scan.close();
    }
}

