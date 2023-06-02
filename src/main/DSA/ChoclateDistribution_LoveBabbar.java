import java.util.Arrays;

public class ChoclateDistribution_LoveBabbar {
    static int chocolate(int []a, int n, int m){
        Arrays.sort(a);
        int min = Integer.MAX_VALUE; // assign the highest value
        for (int i = 0; i+m-1 <n;i++){
            int diff = a[i+m-1] - a[i]; // substract last element from first element
            if (diff < min) min = diff;

        }
        return min;
    }
    public static void main(String[] args)
    {
        int []a = {3,4,5,6,7,8,9,10,11};
        int n = a.length;
        int m = 5; // number of students
        System.out.println(chocolate(a,n,m));
    }

}
