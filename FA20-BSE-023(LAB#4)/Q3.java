import java.util.*;
class Three {
    public static void main(String[] aa) {

        Scanner x = new Scanner(System.in);
        int num, a = 0, b = 1, c, i = 2;
        System.out.println("Enter nth term");
        num = x.nextInt();
        int fib[] = new int[num];
        fib[0] = 0;
        fib[1] = 1;
        while (i < num) {
            fib[i] = a + b;
            a = b;
            b = fib[i];
            i++;
        }
        for (i = 0; i < fib.length; i++) {
            System.out.print(fib[i] + " ");
        }
    }
}