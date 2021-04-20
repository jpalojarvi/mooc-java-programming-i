
public class SandboxSimpleDate {

    private int day;
    private int month;
    private int year;

    public SandboxSimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    // used to check if this date object ('this') is before
    // the date object given as the paramter ('compared')
    public boolean before(SandboxSimpleDate compared) {
        // first compare years
        if (this.year < compared.year) {
            return true;
        }

        if (this.year > compared.year) {
            return false;
        }

        // years are same, compare months
        if (this.month < compared.month) {
            return true;
        }

        if (this.month > compared.month) {
            return false;
        }

        // months are same, compare days
        if (this.day < compared.day){
            return true;
            }
        
        return false;
    }
    public void convertAnObjectOfTypeObjectCalledcomparedToTypeSimpleDateSoThatTheirParametersCanBeCompared(Object compared) { // I think that is what it does..?
           SandboxSimpleDate comparedSimpleDate = (SandboxSimpleDate) compared;
           }
}
