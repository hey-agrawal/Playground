public class SortedRotated_Array_Min {
    public static void main(String[] args){
        int []arr ={5,6,7,8,1,2,3,4};
        int ans = findMin(arr);
        System.out.println(ans);
    }
    public static int findMin(int[] arr){
        int lo = 0;
        int hi = arr.length-1;
        if (arr[lo]<= arr[hi]){
            return arr[0];
        }
        while (lo <= hi){
            int mid = (lo + hi)/2;
            if (arr[mid]>arr[mid+1]){
                return arr[mid+1];
            }
            else if (arr[mid]< arr [mid-1]){
                return arr[mid];
            }
            else if (arr[lo]<= arr[mid]){
                lo = mid+1;
            }
            else if (arr[mid]<= arr [hi]){
                hi = mid+1;
            }
        }
        return -1;
    }


}
