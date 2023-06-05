import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Three_Sum {



        public static List<List<Integer>> triplet(int n, int[] num) {
            List<List<Integer>> ans = new ArrayList<>();
            Arrays.sort(num);
            for (int i = 0; i < n - 2; i++) {
                if (i > 0 && num[i] == num[i - 1])
                    continue;
                int j = i + 1;
                int k = n - 1;
                while (j < k) {
                    int sum = num[i] + num[j] + num[k];
                    if (sum < 0) {
                        j++;
                    } else if (sum > 0) {
                        k--;
                    } else {
                        List<Integer> temp = Arrays.asList(num[i], num[j], num[k]);
                        ans.add(temp);
                        j++;
                        k--;
                        while (j < k && num[j] == num[j - 1])
                            j++;
                        while (j < k && num[k] == num[k + 1])
                            k--;
                    }
                }
            }
            return ans;
        }

        public static void main(String[] args) {
            int n = 6;
            int[] nums = {-1, 0, 1, 2, -1, -4};
            List<List<Integer>> result = triplet(n, nums);
            for (List<Integer> triple : result) {
                for (int num : triple) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }
    }


