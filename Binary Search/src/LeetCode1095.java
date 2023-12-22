public class LeetCode1095 {
    public static void main(String[] args) {
        int[] arr = {1,2,5,4};
        int peak = searchPeakInMoutainArray(arr);
        int target = 0;
        int ans = orderAgnosticSearch(arr, target,0, peak);
        if(ans != -1){
            System.out.println(ans);
        } else {
            ans = orderAgnosticSearch(arr, target, peak + 1, arr.length - 1);
            System.out.println(ans);
        }
    }

    static int searchPeakInMoutainArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start)/ 2;

            if(arr[mid] > arr[mid + 1]){
                end = mid;
            } else {
                start = mid + 1;
            }
        } return end;
    }

    static int orderAgnosticSearch(int[] arr, int target, int start, int end){
        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target) {
                return mid;
            }

            if(isAsc){
                if(arr[mid] > target){
                    end = mid - 1;
                } else if(arr[mid] < target) {
                     start = mid + 1;
                }
            } else {
                if(arr[mid] < target){
                    end = mid - 1;
                } else if (arr[mid] > target) {
                    start = mid + 1;
                }
            }
        } return -1;
    }
}
