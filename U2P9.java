/* Create class calculation with an abstract method area( ). Create Rectangle and
Triangle subclasses of calculation and find area of rectangle and triangle. */
import java.util.Scanner;

abstract class Calculation {

    abstract void area(int a, int b);
}

class Rectangle extends Calculation {

    public void area(int a, int b) {
        int c = a * b;
        System.out.println("Area of rectangle is : " + c);
    }
}

class Triangle extends Calculation {

    public void area(int a, int b) {
        int c = (a + b) / 2;
        System.out.println("Area of Triangle is : " + c);
    }
}

class U2P9 {

    public static void main(String args[]) {
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length : ");
        int a = scanner.hasNextInt() ? scanner.nextInt() : 0;
        if(a==0)
        {
            System.out.println("Invalid: Enter input in integer value.");
            return ;
        }
        System.out.println("Enter width: ");
        int b = scanner.hasNextInt() ? scanner.nextInt() : 0;
        rectangle.area(a, b);
        triangle.area(a, b);
    }
}
