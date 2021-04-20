
public class PaymentTerminal {

    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal() {
        this.money = 1000; // register initially has 1000 euros of money
    }

    public double eatAffordably(double payment) { // CASH PAYMENT
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable meal and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        if (payment >= 2.5) {
            payment -= 2.5;
            this.money += 2.5;
            this.affordableMeals++;
            return payment;
        } else {
            System.out.println("Not enough cash!");
            return payment;
        }
    }

    public boolean eatAffordably(PaymentCard card) { // CARD PAYMENT
        // an affordable meal costs 2.50 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
        if (card.balance() >= 2.5) {
            card.takeMoney(2.5);
            this.affordableMeals++;
            return true;
        } else {
            return false;
        }
    }

    public double eatHeartily(double payment) { // CASH PAYMENT
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        if (payment >= 4.3) {
            payment -= 4.3;
            this.money += 4.3;
            this.heartyMeals++;
            System.out.println("Sold a hearty meal with cash!");
            return payment;
        } else {
            System.out.println("Not enough cash for hearty meal!");
            return payment;
        }
    }

    public boolean eatHeartily(PaymentCard card) { // CARD PAYMENT
        // a hearty meal costs 4.30 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
        if (card.balance() >= 4.3) {
            card.takeMoney(4.3);
            this.heartyMeals++;
            return true;
        } else {
            return false;
        }
    }

//    public void addMoneyToCard(PaymentCard card, PaymentTerminal terminal, double sum){
//        terminal.money += 100;
//        card.addMoney(sum);
//    }
    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum >= 0) {
            card.addMoney(sum);
            money += sum;
        }
    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }

}
