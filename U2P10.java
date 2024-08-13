/* The abstract Vegetable class has four subclasses named cabbage, carrot and
potato. Write an application that demonstrates how to establish this class
hierarchy. Declare one instance variable of type string that indicates the color of
a vegetable. Create and display instances of these object. Override the toString()
method of object to return a string with the name of the vegetable and its color. */
abstract class Vegetable {

    String color;

    abstract public String toString();
}

class Cabbage extends Vegetable {

    Cabbage(String s) {
        color = s;
    }

    public String toString() {
        return ("Cabbage color: " + color);
    }
}

class Carrot extends Vegetable {

    Carrot(String s) {
        color = s;
    }

    public String toString() {
        return ("Carrot color: " + color);
    }
}

class Potato extends Vegetable {

    Potato(String s) {
        color = s;
    }

    public String toString() {
        return ("Potato color: " + color);
    }
}

class U2P10 {

    public static void main(String ags[]) {
        Cabbage cabbage = new Cabbage("Green");
        Carrot carrot = new Carrot("Red");
        Potato potato = new Potato("Yellow");
        System.out.println(cabbage.toString());
        System.out.println(carrot.toString());
        System.out.println(potato.toString());
    }
}
