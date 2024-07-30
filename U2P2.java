/* Write a program to create an array to store 5 integer values. Also
initialize the array with 5 numbers and display the array Elements
in reverse order. */
class U2P2 {

    public static void main(String args[]) {
        int a[] = {2, 4, 3, 6, 1};
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "]= " + a[i]);
        }
        System.out.println("Array in reverse order: ");
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println("a[" + i + "]= " + a[i]); 
        }
    }
}
