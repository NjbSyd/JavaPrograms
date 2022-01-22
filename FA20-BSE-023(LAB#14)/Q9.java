import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q9 {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a String: ");
        String str = bfr.readLine();
        System.out.print("Enter move value: ");
        int Move=Integer.parseInt(bfr.readLine());
        char[] chars=str.toCharArray();
        for (int i = 0; i <Move ; i++) {
            char LastCharacter=chars[chars.length-1];
            for (int j = chars.length-1; j >= 0; j--) {
                if (j == 0) {
                    chars[j] = LastCharacter;
                    break;
                }
                chars[j]=chars[j-1];
            }
        }
        str=String.valueOf(chars);
        System.out.println("String = " + str);
    }
}
