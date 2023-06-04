public class ArrayProductExpectItself {
    public static void main(String[] args)
    {
        long []nums = {1,2,3,4};
        long [] results = productE(nums);
        for (long num : results){
            System.out.print(num+" ");
        }

    }
    public static long[] productE(long[] nums){
        long n = nums.length;
        long [] res = new long[(int) n];
        long productofAllB = 1; //product of all before current position
        long productofAllA = 1; //product of all after current position
        for (int i = 0; i <n;i++){
            res[i] = productofAllB;
            productofAllB *= nums[i];
        }
        for (long i = n-1; i >=0; i--){
            res[(int) i] = productofAllA;
            productofAllA *=nums[(int) i];
        }
        return res;
    }


}
