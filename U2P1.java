/* Write a program to sort the elements of one dimensional array. Read value of array
elements through command line argument. */
class U2P1 {

    public static void main(String args[]) {
        int array[] = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(args[i]);
            System.out.println("array[" + i + "]= " + array[i]);
        }

        System.out.println("Array in reverse order: ");
        for (int i = array.length - 1; i >= 0; i--) {
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
