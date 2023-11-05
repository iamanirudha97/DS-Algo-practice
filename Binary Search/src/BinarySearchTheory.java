public class BinarySearchTheory {

    //works only on sorted arrays of either ascending or descending order.
    public static void main(String[] args) {

        int[] arr = {11, 23, 45, 78, 100,123};
//    int[] arr = {123,100,78,45,23,11};
    int target = 78;
    int ans = binarySearch(arr, target);
    System.out.println(ans);
    }

    //return the index of the element to be searched, return -1 if not found
    public static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end]; //checking if array is Asc or Dsc order

        //finding the middle element in the array
        while(start <= end){
            //it might be possible that range of mid may exceeds the range of integer in java
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            } else {
                if(target > arr[mid]){
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}