
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = null;
        do {            
            str = scanner.nextLine();
            String arr[] = str.split(" ");  
            for (int i = 0; i < arr.length; i++) {
                String temp = arr[i];
                if (temp.contains("av")) {
                    System.out.println(arr[i]);
                }
            }
        } while (!str.equals(""));


    }
}
