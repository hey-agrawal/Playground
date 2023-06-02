import java.awt.color.ProfileDataException;

public class StockBuySell_LeetCode {
    public static void main(String[] args)
    {
        int []a = {7,4,5,6,3,8,9,10,1};
        System.out.println(maxProfit(a));
    }
    static int maxProfit (int []a){
        int maxProfit = 0; // taking the maximum profit as zero and check the profit day by day and update the maxProfit
        int minSoFar = a[0]; // set min value at zeroth index and check each value day by day and update if found any minimum value
        for (int i = 0; i < a.length; i++){
            minSoFar = Math.min(minSoFar,a[i]);
            int Profit = a[i] - minSoFar;
            maxProfit = Math.max(maxProfit, Profit);


        }
        return maxProfit;
    }




}


