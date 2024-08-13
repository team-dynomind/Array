/* Write program to create an array of company name and another array of price
quoted by the company. Fetch the company name who has quoted the lowest
amount. */
import java.util.Scanner;

class U2P4 {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int a[] = new int[5];
        String string[] = new String[5];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter company name: ");
            string[i] = scanner.next();
            System.out.println("Enter quotation: ");
            a[i] = scanner.hasNextInt() ? scanner.nextInt() : 0;
        }
        int min = a[0];
        int j = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
                j = i;
            }
        }
        System.out.println("Name of the company : " + string[j] + " with lowest Quotation: " + a[j]);
    }
}
