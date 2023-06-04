public class Array_MaxProduct {
    public static void main(String[] args)
    {
        int []nums = {4,-2,0,3,-2,5};
        System.out.println(maxProduct(nums));
    }

    static int maxProduct(int[] nums) {
        int n = nums.length;
        int leftProduct = 1;
        int rightProduct = 1;
        int ans = nums[0];
        for (int i = 0; i < n; i++) {
        leftProduct = leftProduct == 0 ? 1 : leftProduct;
        rightProduct = rightProduct == 0 ? 1 : rightProduct;
        leftProduct *= nums[i];
        rightProduct *= nums[n-1-i];
        ans = Math.max(ans, Math.max(leftProduct, rightProduct));
    }
        return ans;
    }

}
