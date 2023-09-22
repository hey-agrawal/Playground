import java.util.Scanner;

class InsertionSort {
    public static void main(String[] args) {
        int c, array[], n;
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number of elements");
        n = in.nextInt();
        System.out.println("enter the elements");
        array = new int[n];
        for (c = 0; c <n; c++){
            array[c] = in.nextInt();
        }

        int i,j;
      for(i =1 ; i<n ; i++){
          int key = array[i];
           j = i-1;
          while (j> -1 && key <array[j] ){
              array[j+1] = array[j];
              j--;
          }
          array[j+1]  = key;
      }

        for(i =0; i< array.length; i++)
            System.out.print(array[i]+"");
        System.out.println("");
    }


}