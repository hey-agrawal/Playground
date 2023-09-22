import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        int array[], n, c;
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number of element");
        n = in.nextInt();
        System.out.println("enter the elements");
        array = new int[n];
        for (c = 0; c < n; c++) {
            array[c] = in.nextInt();
        }

        int i;
        for (i = 0; i < array.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[index]) {
                    index = j;
                }

            }
            int smallestnumber = array[index];
            array[index] = array[i];
            array[i] = smallestnumber;
        }


        for (i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println("");
    }

}
