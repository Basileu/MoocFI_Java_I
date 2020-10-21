
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstCont = 0;
        int secondCont = 0;

        while (true) {
            System.out.print("> ");
            System.out.println("\nFirst: " + firstCont + "/100");
            System.out.println("Second: " + secondCont + "/100");
            String input = scan.nextLine();
            if (input.equals("quit")) {
//                System.out.println("First: " + firstCont + "/100");
//                System.out.println("Second: " + secondCont + "/100");

                break;
            } else {

                String[] parts = input.split(" ");
                String cmd = parts[0];
//                if(cmd.equals("quit"))
                int amount = Integer.valueOf(parts[1]);
                if (amount < 0) {
                    continue;
                }
                switch (cmd) {
                    case "add":
                        firstCont += amount;
                        if (firstCont >= 100) {
                            firstCont = 100;
                        }
                        break;
                    case "move":

                        secondCont += (amount >= firstCont) ? firstCont : amount;
                        if (secondCont >= 100) {
                            secondCont = 100;
                        }
                        firstCont -= amount;
                        if (firstCont <= 0) {
                            firstCont = 0;
                        }
                        break;
                    case "remove":
                        secondCont -= amount;
                        if (secondCont <= 0) {
                            secondCont = 0;
                        }
                        break;
                    default:
                        System.out.println("Unknown command");
                        break;

                }
//                System.out.println("First: " + firstCont + "/100");
//                System.out.println("Second: " + secondCont + "/100");
            }

        }
    }

}
