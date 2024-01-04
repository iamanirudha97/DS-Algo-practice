import java.util.Arrays;
//works only on a range of numbers from 1 to N
public class CycleSort {
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cycleSort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correctInd = arr[i] - 1;
            if(arr[i] != arr[correctInd]){
                swap(arr, i, correctInd);
            } else i++;
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
