import java.util.Arrays;

public class SelectAndInsertSort {
    public static void main(String[] args) {
//        int[] arr = {2, -123, 0, 23,1444,542};
        int[] arr = {5,3,4,1,2};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void selectionSort(int[] arr){
        for (int i = 0; i< arr.length; i++){
            int last = arr.length - i - 1;
            int max = getMaxIndex(arr, 0, last);
            swap(arr, max, last);
        }
    }

    static void insertionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++){
            for(int j = i + 1; j > 0; j--){
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                } else break;
            }
        }
    }

     static int getMaxIndex(int[] arr, int start, int last) {
        int max = start;
        for(int i = start; i <= last; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        } return max;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
