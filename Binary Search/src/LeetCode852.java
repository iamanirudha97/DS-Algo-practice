public class LeetCode852 {
    public static void main(String[] args) {
        int[] arr = {0,10,5,2};
        int ans = peakIndexInMountainArray(arr);
        System.out.println(ans);
    }
    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid+1]){
                end = mid;
            }
            //we also need to check for the left side value since the value could be
            // in the increasing part of the array as well
            else {
                start = mid + 1;
            }
        }
        return start; // or return end since both will point the peak value's index
    }
}