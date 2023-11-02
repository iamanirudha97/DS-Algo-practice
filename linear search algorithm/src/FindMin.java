public class FindMin {
    public static void main(String[] args) {
        int[] arr = {18, 12,-7, 3, 14, 28};
        System.out.println(min(arr, 0, 5));
    }

    public static int min(int[] arr){
        int min = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        } return min;
    }

    //minimum for a given range
    public static int min(int[] arr,int from,int to){
        int min = arr[from];
        for(int i = from; i < to; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        } return min;

    }
}
