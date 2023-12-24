public class LeetCode33 {
    public static void main(String[] args) {
       int[] arr = {3,4,5,1,2,3};
//        System.out.println(findPivotWithDuplicates(arr));
        System.out.println(search(arr, 4));
    }

    static int search(int[] arr, int target) {
        int pivot = findPivot(arr);

        //if pivot not found that means the array is not rotated so you can do normal binary search
        if(pivot == -1){
            return binarySearch(arr, target, 0, arr.length - 1);
        }

        if(arr[pivot] == target){
            return pivot;
        }

        if(target >= arr[0]){
            return binarySearch(arr, target, 0, pivot - 1);
        }
        return binarySearch(arr, target, pivot + 1, arr.length - 1);
    }

    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2;
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }

            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }

            if(arr[mid] <= arr[start]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        } return -1;
    }

    static int findPivotWithDuplicates(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2;
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }

            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }

            //if mid, start and end are equal then skip the duplicates
            if(arr[mid] == arr[start] && arr[mid] == arr[end]) {
                //skip the duplicates
                //NOTE: what if the elements at start and end were the pivot
                //check if start is pivot
                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                //check if the end is pivot
                if (arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }

            //if the left side is sorted, pivot should be in right
                else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
        } return -1;
    }

    static int binarySearch(int[] arr, int target, int start , int end){

        while(start <= end){
            int mid = start + (end - start)/ 2;

            if(target == arr[mid]){
                return mid;
            }

            if(target < arr[mid]){
                end = mid - 1;
            }

            if(target > arr[mid]){
                start = mid + 1;
            }
        }
        return -1;
    }

}
