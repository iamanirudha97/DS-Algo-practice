import java.util.Scanner;
public class Theory {
    public static void main(String[] args) {
        int[] arr = {-1, 18, 12, 9, 14, 77, 50};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to check if it exists in the Array");
        int numberToCheck = sc.nextInt();
        System.out.println(linearSearch(arr, numberToCheck));
    }
    public static boolean linearSearch(int[] arr, int number){
        for (int j : arr) {
            if (j == number) {
                return true;
            }
        }
        return false;
    }
}