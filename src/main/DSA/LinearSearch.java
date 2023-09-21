import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args){
        int n,c,search,array[];
        Scanner in  = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        n = in.nextInt();

        array = new int[n];
         System.out.println("enter the elements in array");
         for(c = 0 ; c < n ; c++)
             array[c] = in.nextInt();

         System.out.println("enter the value to be search ");
         search = in.nextInt();

         for (c = 0 ; c < n ; c++){
             if(array[c] == search){
                 System.out.println("element fount at "+ (c+1) );
                 break;
             }

         }
        if (n == c) {
            System.out.println("element not found");
        }

    }

}
