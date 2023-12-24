public class LeetCode410 {
    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
        System.out.println(splitArray(arr,2));
    }

    static int splitArray(int[] nums, int k) {
        int start = 0;
        int end = nums.length - 1;

        for(int num : nums){
            start = Math.max(start, num);
            end += num;
        }

        while(start < end) {
            int sum = 0;
            int subArrays = 1;
            int mid = start + (end - start) / 2;

            for (int num : nums) {
                if (sum + num > mid) {
                    sum = num;
                    subArrays++;
                } else {
                    sum += num;
                }
            }

            if (subArrays > k) {
                start = mid + 1;
            } else {
                end = mid;
            }

        } return end;
    }
}
