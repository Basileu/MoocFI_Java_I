
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }
    public void advance() {
        ++day;
        if (day > 30) {
            day = 1;
            ++month;
            if(month > 12) {
                month  = 1;
                ++year;
            }
        }
    }

    public void advance(int howManyDays) {
        day += howManyDays;
        if (day > 30) {
            day = day - 30;
            ++month;
            if (month > 12) {
                month = 1;
                ++year;
            }
        }
    }
    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate retObj = new SimpleDate(day, month, year);
        retObj.advance(days);
        
        return retObj;
    }
}
