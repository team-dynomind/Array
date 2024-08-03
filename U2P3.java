/* Write a program to find sum of two matrices of 3 x3. */
import java.util.Scanner;

class U2P3 {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int[][] mOne = new int[3][3];
        int[][] mTwo = new int[3][3];
        System.out.println("Enter the value of first 3*3 matrix: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Element[" + i + "][" + j + "]:");
                mOne[i][j] = scanner.hasNextInt() ? scanner.nextInt() : 0;
            }
        }
        System.out.println("Enter the value of second 3*3 matrix: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Element[" + i + "][" + j + "]:");
                mTwo[i][j] = scanner.hasNextInt() ? scanner.nextInt() : 0;
            }
        }
        scanner.close();

        int[][] sum = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(sum[i][j] + "");
            }
            System.out.println();
        }
    }
}
