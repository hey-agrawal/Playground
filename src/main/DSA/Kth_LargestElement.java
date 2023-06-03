import java.util.Arrays;

public class Kth_LargestElement {
    public static void main(String[] args)
    {
        int []a = {7,4,5,6,3,8,9,10,1};
        int k = 5;
        System.out.println(FindKthElement(a,k));
    }
    public static int FindKthElement(int[] a, int k){
        Arrays.sort(a);
        return a[a.length-k];

    }
}
