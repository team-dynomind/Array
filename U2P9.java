/* Create class calculation with an abstract method area( ). Create Rectangle and
Triangle subclasses of calculation and find area of rectangle and triangle. */
abstract class Calculation {

    abstract void Area(int x, int y);
}

class Rectangle extends Calculation {

    public void Area(int x, int y) {
        int rectangleArea = (x * y);
        System.out.println("Area of Rectangle: ");
    }
}

class Triangle extends Calculation {

    public void Area(int x, int y) {
        int triangleArea = (1 / 2 * x + y);
        System.out.println("Area of Rectangle: ");
    }
}

class U2P9 {

    public static void main(String args[]) {
        Rectangle objectOne = new Rectangle();
        Triangle objectTwo = new Triangle();
        objectOne.Area(5, 6);
        objectTwo.Area(5, 6);
    }
}
