/* Write a program to create an array to store 5 integer values. Also
initialize the array with 5 numbers and display the array Elements
in reverse order. */
import java.util.Scanner;

class U2P4

{
    public static void main(String args[]) {
        int a[] = new int[5];
        String s[] = new String[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter company name:");
            s[i] = scanner.next();
            System.out.println("Enter Quotation:");
            a[i] = scanner.hasNextInt() ? scanner.nextInt() : 0;
        }
        int min = a[0];
        int j = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[j] > min) {
                min = a[i];
                j = i;
            }
        }
        System.out.println("Name of company: " + s[j]);
        System.out.println("Lowest Quotation : " + a[j]);
    }
}