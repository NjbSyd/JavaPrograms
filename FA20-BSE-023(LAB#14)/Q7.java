import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q7 {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a String: ");
        String str = bfr.readLine();
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] += 32;
            } else if (chars[i] >= 'a' && chars[i] <= 'z') {
                chars[i] -= 32;
            }
        }
        str=String.valueOf(chars);
        System.out.println(str);
    }
}
