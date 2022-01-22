import java.util.*;

class One {

    public static void main(String[] a) {
        Scanner c = new Scanner(System.in);
        int[] nums = new int[10];
        int[] pos = new int[10];
        int i;
        System.out.print("Enter a number: ");
        for (i = 0; i < 10; i++) {
            nums[i] = c.nextInt();
            if (i < 9) {
                System.out.print("Enter next number: ");
            }
        }
        System.out.print("Enter a number to find it: ");
        int fnum = c.nextInt();
        int count = 0;
        for (i = 0; i < 10; i++) {
            if (nums[i] == fnum) {
                pos[count] = i;
                count++;
            }
        }
        System.out.print("\nThe given number exists " + count + " times in the data\n");
        if (count > 0) {
            System.out.print("Indexes are: ");
            for (i = 0; i < 10; i++) {
                if (i == 0) {
                    System.out.print(pos[i] + " ");
                } else if (i > 0 && pos[i] != 0) {
                    System.out.print(pos[i] + " ");
                }
            }
        }
        System.out.println();
    }
}