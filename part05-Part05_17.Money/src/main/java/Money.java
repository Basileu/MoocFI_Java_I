
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {
        Money newMoney = new Money(this.euros + addition.euros, this.cents + addition.cents);
        // return the new Money object
        return newMoney;
    }

    public boolean lessThan(Money compared) {
        if (euros < compared.euros) {
            return true;
        } else if (euros == compared.euros) {
            if (cents <= compared.cents) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public Money minus(Money decreaser) {
        
        if (this.lessThan(decreaser))
            return new Money(0, 0);
        else {
            if (cents < decreaser.cents){
                Money newM = new Money(euros - (decreaser.euros + 1), 100 - decreaser.cents);
                return newM;
            } else {
                Money newM = new Money(euros - decreaser.euros, cents - decreaser.cents);
                return newM;
            }
        }
    }

}
