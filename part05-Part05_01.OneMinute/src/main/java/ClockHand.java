class Timer {
    private ClockHand tenMilisec;
    private ClockHand seconds;

    public Timer() {
        tenMilisec = new ClockHand(100);
        seconds = new ClockHand(60);
        
    }
    public void advance() {
        tenMilisec.advance();
        
        if (tenMilisec.value() == 0) {
            seconds.advance();
        }
    }
    @Override
    public String toString() {
        return (seconds.toString() + ":" + tenMilisec.toString());
    }
}
public class ClockHand {

    private int value;
    private int limit;

    public ClockHand(int limit) {
        this.limit = limit;
        this.value = 0;
    }

    public void advance() {
        this.value = this.value + 1;

        if (this.value >= this.limit) {
            this.value = 0;
        }
    }

    public int value() {
        return this.value;
    }

    public String toString() {
        if (this.value < 10) {
            return "0" + this.value;
        }

        return "" + this.value;
    }
}
