import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {-1, 18, 12, 9, 14, 77, 50};
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number to check if it exists in the Array");
        int numberToCheck = sc.nextInt();

        System.out.println("Enter a range");
        int from = sc.nextInt();
        int to = sc.nextInt();

        System.out.println(linearSearchInRange(arr, numberToCheck, from, to));
    }
    public static boolean linearSearchInRange(int[] arr, int number, int from, int to){
        for(int i = from; i < to; i++){
            if(arr[i] == number){
                return true;
            }
        }
        return false;
    }
}
