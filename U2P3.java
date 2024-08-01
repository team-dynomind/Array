/* Write a program to find sum of two matrices of 3 x3. */
import java.util.Scanner;

class U2P3 {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of matrices you want: ");
        int numMatrices = scanner.hasNextInt() ? scanner.nextInt() : 0;

        System.out.println("Enter the number of elements in each matrix: ");
        int numElements = scanner.hasNextInt() ? scanner.nextInt() : 0;

        int sumMatrix[][] = new int[numElements][numElements];
        for (int i = 0; i < numMatrices; i++) {
            int matrix[][] = new int[numElements][numElements];
        }

        System.out.println("Enter the elements of Matrix:");
    }
}