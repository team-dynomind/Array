/* Write a program to create an array to store 5 integer values. Also
initialize the array with 5 numbers and display the array Elements
in reverse order. */
import java.util.Scanner;
class U2P2 {

    public static void main(String args[]) {
        int array[] = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 integer values: ");
        for (int i = 0; i < 5; i++) {
            array[i]=scanner.hasNextInt() ? scanner.nextInt() : 0;
            System.out.println("a [" + i + "]= " + array[i]);
        }
        System.out.println("Array in reverse order: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println("a [" + i + "]= " + array[i]); 
        }
    }
}
