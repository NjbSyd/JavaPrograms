import java.util.*;

class Two {

    public static void main(String[] a) {
        Scanner c = new Scanner(System.in);
        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[10];
        int i, j;
        System.out.print("Enter a number: ");
        for (i = 0; i < 10; i++) {
            A[i] = c.nextInt();
            if (i < 9) {
                System.out.print("Enter next number: ");
            }
        }

        j = 0;
        i = 10;
        while (i > 0) {
            B[j] = A[i - 1];
            j++;
            i--;
        }

        for (i = 0; i < 10; i++) {
            C[i] = A[i] + B[i];
        }
        j = 1;
        while (j < 4) {
            for (i = 0; i < 10; i++) {
                if (j == 1) {
                    if (i == 0) {
                        System.out.print("Array A: " + A[i] + " ");
                    } else {
                        System.out.print(A[i] + " ");
                    }
                } else if (j == 2) {
                    if (i == 0) {
                        System.out.print("Array B: " + B[i] + " ");
                    } else {
                        System.out.print(B[i] + " ");
                    }
                } else if (j == 3) {
                    if (i == 0) {
                        System.out.print("Array C: " + C[i] + " ");
                    } else {
                        System.out.print(C[i] + " ");
                    }
                }
            }
            System.out.println();
            j++;
        }

        //This can alsobe used to print all arrays
        /*System.out.print("\nArray A: ");
        for(i=0;i<10;i++){System.out.print(A[i] + " ");}
		 System.out.print("\nArray B: ");
        for(i=0;i<10;i++){System.out.print(B[i] + " ");}
        System.out.print("\nArray C: ");
        for(i=0;i<10;i++){System.out.print(C[i] + " ");}
*/





    }
}