public class MaximumSubarray_KadanesTheoram {
    public static void main(String[] args)
    {
        int a[] = {-1,3,4,-2};
        System.out.println(maximumSubarraySum(a));

    }
    public static int maximumSubarraySum(int[] a){
        int maxSum = a[0];
        int sum = a[0];
        for (int i = 1; i < a.length; i++){
            if (sum >= 0){
                sum += a[i];

            }
                else
            {
                sum = a[i];
            }
              if (sum > maxSum){
                  maxSum = sum;
              }
        }

        return maxSum;
    }

}
