
import java.util.Scanner;

//A year is a leap year if it is divisible by 4. 
//However, if the year is divisible by 100, then it is a leap year only when it is also divisible by 400.
//
//Write a program that reads a year from the user, and checks whether or not it is a leap year.
public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a year:");
        int year = Integer.valueOf(scan.nextLine());
        String result;
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                result = " a ";
            } else {
                result = " not a ";
            }
        } else if (year % 4 == 0) {
            result = " a ";
        } else {
            result = " not a ";
        }
        System.out.println("The year is" + result + "leap year.");

    }
}
