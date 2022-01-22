import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q6 {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a String: ");
        String str = bfr.readLine();
        char[] chars = str.toCharArray();
        String Reverse_str="";
        for (int i = 0; i < chars.length ; i++) {
            Reverse_str=chars[i]+Reverse_str;
        }
        System.out.println("Reverse String = " + Reverse_str);
    }
}
