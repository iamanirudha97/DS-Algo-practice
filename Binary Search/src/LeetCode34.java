import java.lang.reflect.Array;
import java.util.Arrays;

public class LeetCode34 {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,9,1,8,10};
        int target = 8;
        //output = [3,4]
        int[] ans = searchRange(nums, target);
        System.out.println(Arrays.toString(ans));
    }
     static int[] searchRange(int[] arr, int target){
        int [] ans = {-1, -1};

        //check for first occurance
         int start = search(arr, target, true);
         int end = search(arr, target, false);

         ans[0] = start;
         ans[1] = end;

         return ans;
    }

    static int search(int[] nums, int target, boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int mid = start + (end - start)/ 2;

            if(target > nums[mid]){
                start = mid + 1;
            } else if(target < nums[mid]) {
                end = mid - 1;
            } else {
                ans = mid;
                if(findStartIndex){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
