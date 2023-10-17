import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static int counting(String k){
        int count = 0;
        for(int i = 0; i<k.length();i++){
            if (k.charAt(i) == '#'){
                count++;
            }
        }
        return count;
    }
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0;i<t;i++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            sc.nextLine();
            int max_count = 0;
            for(int j = 0;j<n;j++){
                String k = sc.nextLine();
                int count = counting(k);
                if(count>max_count){
                    max_count = count;
                }
            }
            System.out.println(max_count);
        }
    }
}
