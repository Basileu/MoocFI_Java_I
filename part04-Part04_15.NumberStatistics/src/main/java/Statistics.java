
public class Statistics {
    private int countNr;
    private int sum;
    
    public Statistics() {
        countNr = 0;
        sum = 0;
    }
    
    public double average() {
        if (countNr == 0) {
            return 0;
        } else {
            return (double)sum/countNr;
        }
        
    }
    public int sum() {
        return sum;
    }
    public void addNumber(int number) {
        sum += number;
        ++countNr;
    }
    
    public int getCount() {
        return countNr;
    }
}
