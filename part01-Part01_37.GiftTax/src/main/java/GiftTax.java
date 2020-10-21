
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        int giftValue = Integer.valueOf(scan.nextLine());
        String result;

        if (giftValue < 5000) {
            System.out.println("No tax!");
        } else if (giftValue == 5000){
            System.out.println("Tax: 100.0");
        } else if (giftValue < 25000) {
            System.out.println("Tax: " + (100 + (double)(giftValue-5000)*0.08));
        } else if (giftValue < 55000) {
            System.out.println("Tax: " + (1700 + (double)(giftValue-25000)*0.1));
        } else if (giftValue < 200000) {
            System.out.println("Tax: " + (4700 + (double)(giftValue-55000)*0.12));
        } else if (giftValue < 1000000) {
            System.out.println("Tax: " + (22100 + (double)(giftValue-200000)*0.15));
        } else {
            System.out.println("Tax: " + (142100 + (double)(giftValue-1000000)*0.17));
        }
        scan.close();        
    }
}
