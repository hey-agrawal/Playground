import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args)
    {
        int array[],n, c , Search;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements ");
        n = in.nextInt();

        array = new int[n];
        System.out.println("enter the number of elements ");
        for (c = 0; c<n; c++)
            array[c] = in.nextInt();
        System.out.println("Enter the element to search ");
        Search = in.nextInt();



        int right = array[0];
        int left = array.length-1;
        int mid = ( right + left)/2;

        while (left<=right){
            if(array[mid]<Search){
                left = mid+1;

            }else if(array[mid]==Search){
                System.out.println("element found at"+ mid);
                break;
            }
            else{
                right = mid - 1;
        }
            mid = ( right + left)/2;
        }
        if (left > right){
            System.out.println("element not found");
        }

    }
}
