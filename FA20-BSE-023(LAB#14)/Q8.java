import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q8 {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a String: ");
        String str = bfr.readLine();
        char[] chars = str.toCharArray();
        System.out.print("Enter Positions to move value: ");
        int Move = Integer.parseInt(bfr.readLine());
        System.out.println("Enter direction(f,r): ");
        char direction = bfr.readLine().charAt(0);
        if (direction == 'r' || direction == 'R' || direction == 'f' || direction == 'F') {
            switch (direction) {
                case 'r':
                case 'R':
                    for (int i = 0; i < chars.length; i++) {
                        chars[i] -= Move;
                    }
                    str = String.valueOf(chars);
                    break;

                case 'f':
                case 'F':
                    for (int i = 0; i < chars.length; i++) {
                        chars[i] += Move;
                    }
                    str = String.valueOf(chars);
                    break;
            }
            System.out.println(str);
        }

    }
}
