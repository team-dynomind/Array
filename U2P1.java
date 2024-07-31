/* Write a program to sort the elements of one dimensional array. Read value of array
elements through command line argument. */
import java.util.Scanner;
class U2P1 {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array: ");
        int n = scanner.hasNextInt() ? scanner.nextInt() : 0;
        int array[] = new int[n];

        System.out.println("Enter elements of the array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.hasNextInt() ? scanner.nextInt() : 0;
        }

        System.out.println("Array elements are: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "]= " + array[i]);
        }
        
        System.out.println("Array after sorting: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int t = array[i];
                    array[i] = array[j];
                    array[j] = t;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "]= " + array[i]);
        }
    }
}
