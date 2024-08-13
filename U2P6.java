/* Create a class called NumberData that accept any array of the five numbers.
Create a sub class called Numplay which provides methods for followings:
1. Display numbers entered.
2. Sum of the number.
3. Average of the numbers.
4. Maximum of the numbers.
5. Minimum of the numbers.
Create a class that provides menu for above methods. Give choice from the
command-line argument. */
import java.util.Scanner;

class NumberData {

    int a[] = new int[5];
    Scanner scanner = new Scanner(System.in);

    public void CreateArray() {
        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter element " + i + ": ");
            a[i] = scanner.hasNextInt() ? scanner.nextInt() : 0;
        }
    }
}

class NumPlay extends NumberData {

    public void display() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Element " + i + ": " + a[i]);
        }
    }

    public void Sum() {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += a[i];
        }
        System.out.println("Sum is: " + sum);
    }

    public void Average() {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += a[i];
        }
        float average = (float) sum / 5;
        System.out.println("Average is: " + average);
    }

    public void Max() {
        int maximum = 0;
        for (int i = 0; i < 5; i++) {
            if (maximum < a[i]) {
                maximum = a[i];
            }
        }
        System.out.println("Maximum is: " + maximum);
    }

    public void Min() {
        int minimum = a[0];
        for (int i = 0; i < 5; i++) {
            if (minimum > a[i]) {
                minimum = a[i];
            }
        }
        System.out.println("Minimum is: " + minimum);
    }
}

public class U2P6 {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        NumPlay object = new NumPlay();
        object.CreateArray();
        int choice;
        do
        {
            printMessage("1.Display numbers entered.");
            printMessage("2.Sum of numbers.");
            printMessage("3.Average of numbers.");
            printMessage("4.Maximum of numbers.");
            printMessage("5.Minimum of numbers.");
            printMessage("6.Exit.");
            printMessage("Enter your choice: ");
            choice = scanner.hasNextInt() ? scanner.nextInt() : 0;
            switch (choice) {
                case 1:
                    object.display();
                    break;
                case 2:
                    object.Sum();
                    break;
                case 3:
                    object.Average();
                    break;
                case 4:
                    object.Max();
                    break;
                case 5:
                    object.Min();
                    break;
                case 6:
                    printMessage("Exiting the program.");
                    break;
                default:
                    printMessage("Invalid choice.");
                    break;
            }
        }
        while(choice!=5);
    }
    public static void printMessage(String message) {
        System.out.println(message);
    }
}
