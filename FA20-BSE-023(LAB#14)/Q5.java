import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q5 {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a String: ");
        String str = bfr.readLine();
        str = str.trim();
        char[] chars = str.toCharArray();
        int Count_Words = 1, Count_Uppers = 0, Count_Lowers = 0, Count_Specials = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                Count_Uppers++;
            } else if (chars[i] >= 'a' && chars[i] <= 'z') {
                Count_Lowers++;
            } else if (chars[i] == ' ') {
                if (chars[i + 1] == ' ') {
                    continue;
                } else {
                    Count_Words++;
                }
            } else {
                Count_Specials++;
            }
        }
        System.out.println("No of Words = " + Count_Words);
        System.out.println("UpperCase = " + Count_Uppers);
        System.out.println("LowerCase = " + Count_Lowers);
        System.out.println("Specials Characters= " + Count_Specials);
    }
}
