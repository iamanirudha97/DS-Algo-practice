public class LeetCode33 {
    public static void main(String[] args) {
       int[] arr = {3,4,0,1,2,};
        System.out.println(search(arr, 2));
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
