
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container firstCont = new Container();
        Container secondCont = new Container();

        while (true) {
            System.out.print("> ");
            System.out.println("\nFirst: " + firstCont);
            System.out.println("Second: " + secondCont);

            String input = scan.nextLine();
            if (input.equals("quit")) {
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
                        firstCont.add(amount);
                        break;
                    case "move":
                        int volumeFirst = firstCont.contains();
                        secondCont.add(volumeFirst >= amount ? amount : volumeFirst);
                        firstCont.remove(amount);
                        break;
                    case "remove":
                        secondCont.remove(amount);
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
