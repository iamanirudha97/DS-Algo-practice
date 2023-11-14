public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
//        int[] arr = {18, 16, 14, 9, 5, 3, 2};
        int target = 14;
        int ans = searchBinary(arr, target);
        System.out.println(ans);
    }

    public static int searchBinary(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];

        if(target > arr[end]){
           return -1;
        }

        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
               if (target < arr[mid]){
                   end = mid - 1;
               } else if (target > arr[mid]) {
                   start = mid + 1;
               }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                }

            }
        } return arr[start];
    }
}
