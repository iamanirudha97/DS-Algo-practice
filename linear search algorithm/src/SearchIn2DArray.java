import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

//finding co-ordinates of the input element in the 2D array
//find maximum in the 2D array

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18,12}
        };

        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        System.out.println(Arrays.toString(search(arr, target)));
        System.out.println(max(arr));
    }

    public static int[] search(int[][] arr, int target){
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                if(arr[row][col] == target ) {
                    return new int[] {row, col};
                }
            }
        } return new int[]{ };
    }

    public static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                if(max < arr[row][col]){
                    max = arr[row][col];
                }
            }
        } return max;
    }
}



