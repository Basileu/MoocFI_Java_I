
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author basil
 */
public class Point {

    ArrayList<Integer> myPointsLst;
    int sum;

    public Point() {
        myPointsLst = new ArrayList<>();
        sum = 0;
    }

    public void addPoints(int points) {
        if (points >= 0 && points <= 100) {

            myPointsLst.add(points);
            sum += points;
        }
    }

    public double calculateAverage() {
        return (double) sum / myPointsLst.size();
    }

    public double calculatePassingAverage() {
        int sum = 0;
        int cnt = 0;
        for (Integer integer : myPointsLst) {
            if (integer >= 50) {
                sum += integer;
                ++cnt;
            }
        }
        if (cnt > 0) {
            return (double) sum / cnt;
        } else {
            return 0;
        }
    }

    public double calculatePassPercentage() {
        int sum = 0;
        int cntPassing = 0;
        for (Integer integer : myPointsLst) {
            if (integer >= 50) {
//                sum += integer;
                ++cntPassing;
            }
        }
        if (cntPassing > 0) {
            return (double) cntPassing * 100 / myPointsLst.size();
        } else {
            return 0;
        }
    }

    public void gradeDisti() {
        System.out.println("Grade distribution:\n");
        int[] arrStars = new int[]{0, 0, 0, 0, 0,0};
        for (Integer var : myPointsLst) {
            if (var < 50) {
                arrStars[0] += 1;
            } else if (var<60){
                arrStars[1] += 1;
            } else if (var<70){
                arrStars[2] += 1;
            } else if (var<80){
                arrStars[3] += 1;
            } else if (var<90){
                arrStars[4] += 1;
            } else if (var>=90){
                arrStars[5] += 1;
            }
        }
        for (int i = 5; i >= 0; --i) {
            System.out.print(Integer.toString(i)+": ");
            for (int j = 0; j < arrStars[i]; j++) {
                System.out.print("*");
            }
            System.out.println("");
            
        }

    }

}
