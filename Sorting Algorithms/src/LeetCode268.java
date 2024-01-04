import java.util.Arrays;
//https://leetcode.com/problems/missing-number/
//Amazon interview

public class LeetCode268 {
    public static void main(String[] args) {
        int[] nums = {0,2};
        int res = missingNumber(nums);
        System.out.println(res);
    }

    static int missingNumber(int[] arr){
        int i = 0;
        while(i < arr.length){
            if(arr[i] < arr.length && arr[i] != i){
                swap(arr, arr[i], i);
            } else i++;
        }

        for(int j = 0; j < arr.length; j++){
            if(arr[j] != j){
                return j;
            }
        }
        return arr.length;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
