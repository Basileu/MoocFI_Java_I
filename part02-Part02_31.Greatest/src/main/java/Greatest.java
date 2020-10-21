
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        //write some code here
        //write some code here
        List<Integer> myList = Arrays.asList(number1, number2, number3);
        myList.sort((a, b)-> -a+b);
//        Collections.sort(myList);
        
        return myList.get(0);
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
