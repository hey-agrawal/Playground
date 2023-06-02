import java.util.Arrays;
import java.util.Scanner;

public class Duplicate_Array_Element {
    public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter the number of elements");
      int size = scanner.nextInt();
      int[] num = new int[size];
      System.out.println("enter the element");
      for (int i = 0; i < num.length; i++){
          num[i] = scanner.nextInt();
      }
        boolean hasDuplicate = containsDuplicate(num);
        System.out.println("Array contains duplicate elements: " + hasDuplicate);

    }
    public static boolean containsDuplicate(int[] num){
        Arrays.sort(num);
         for (int i = 0; i<num.length-1; i++){
             if(num[i] == num[i+1])
             {
                 return true;
             }
         }
        return false;
    }
}
