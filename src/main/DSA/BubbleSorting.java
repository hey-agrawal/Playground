import java.util.Scanner;

public class BubbleSorting {
    public static void main(String[] args){
        int array[], n, c;
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number of element");
        n = in.nextInt();
        System.out.println("enter the elements");
        array = new int[n];
        for (c = 0; c < n ; c++){
            array[c] = in.nextInt();
        }

        int i,j,temp;
        boolean swapped;
        for (i = 0; i < n; i++){
            swapped = false;
            for (j = 0; j <n-1-i; j++){
                if (array[j]>array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false)
                break;

        }

        for(i =0; i< array.length; i++)
        System.out.print(array[i]+"");
        System.out.println("");
    }

}
