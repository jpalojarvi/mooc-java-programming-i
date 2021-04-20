// MY SHITTY SOLUTION

//public class Money {
//
//    private final int euros;
//    private final int cents;
//
//    public Money(int euros, int cents) {
//
//        if (cents > 99) {
//            euros = euros + cents / 100;
//            cents = cents % 100;
//        }
//
//        this.euros = euros;
//        this.cents = cents;
//    }
//
//    public int euros() {
//        return this.euros;
//    }
//
//    public int cents() {
//        return this.cents;
//    }
//
//    public String toString() {
//        String zero = "";
//        if (this.cents < 10) {
//            zero = "0";
//        }
//
//        return this.euros + "." + zero + this.cents + "e";
//    }
//
//    public Money plus(Money addition) {
//        Money newAmount = new Money(this.euros + addition.euros, this.cents + addition.cents); // original euros and cents can also be declared without "this.", but let's use them for clarity
//        return newAmount;
//    }
//
//    public Money minus(Money decreaser) {
//        Money newAmount = new Money(this.euros - decreaser.euros, this.cents - decreaser.cents);
//
//        Money secondNewAmountWithOneLessEuro = new Money(newAmount.euros - 1, newAmount.cents);
//
//        if (this.cents - decreaser.cents < 0) {
//            int nonNegativeCents = 100 - this.cents - decreaser.cents;
//            Money thirdNewAmountWithNonNegativeCents = new Money(secondNewAmountWithOneLessEuro.euros, nonNegativeCents);
//            if (thirdNewAmountWithNonNegativeCents.euros < 0) {
//                Money fourthNewAmountWithNonNegativeEuros = new Money(0, nonNegativeCents);
//                return fourthNewAmountWithNonNegativeEuros;
//            }
//            return thirdNewAmountWithNonNegativeCents;
//
//        }
//        if (newAmount.euros < 0) {
//            Money newAmountWithNonNegativeEurosAndCents = new Money(0, 0);
//            return newAmountWithNonNegativeEurosAndCents;
//        }
//
//        return newAmount;
//
//    }
//
//    public boolean lessThan(Money comparedMoney) { // once again this. for clarity (?)
//        if (this.euros < comparedMoney.euros) {  // if first euros are less than compared, it's definitely true
//            return true;
//        }
//        if (this.cents < comparedMoney.cents && euros <= comparedMoney.euros) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//}

// MODEL SOLUTION
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
 
    @Override
    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }
 
        return this.euros + "." + zero + this.cents + "e";
    }
 
    public Money plus(Money addition) {
        int eurosLocalVariable = this.euros + addition.euros();
        int centsLocalVariable = this.cents + addition.cents();
 
        if (centsLocalVariable > 99) {
            centsLocalVariable -= 100;
            eurosLocalVariable++;
        }
 
        return new Money(eurosLocalVariable, centsLocalVariable);
    }
 
    public boolean lessThan(Money compared) {
        return (100 * this.euros + this.cents) < (100 * compared.euros() + compared.cents());
    }
 
    public Money minus(Money decreaser) {
        int eurosLocalVariable = this.euros - decreaser.euros();
        int centsLocalVariable = this.cents - decreaser.cents();
 
        if (centsLocalVariable < 0) {
            centsLocalVariable += 100;
            eurosLocalVariable--;
        }
 
        // if the value becomes negative, return zero
        if (eurosLocalVariable < 0) {
            return new Money(0, 0);
        }
 
        return new Money(eurosLocalVariable, centsLocalVariable);
    }
}