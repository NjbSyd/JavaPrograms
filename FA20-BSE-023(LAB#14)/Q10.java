import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10 {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a String: ");
        String str = bfr.readLine();
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += str.charAt(i);
        }
        System.out.println(sum + "\t" + (sum == 0 ? "zero" : (sum % 2 == 0 ? "Even" : "Odd")));
    }
}
