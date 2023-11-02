import java.util.Scanner;

public class SearchInStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String line = sc.nextLine();

        System.out.println("Enter the Character to Search in the String");
        char charToFind = sc.next().charAt(0);
        System.out.println(inString(line, charToFind));
    }

    public static boolean inString(String line, char letter){
        for(int c = 0; c < line.length(); c++){
            if(line.charAt(c) == letter){
                return true;
            }
        } return false;
    }
}
