
public class Container {

    private int currentCapacity;
    private int maxCapacity;

    public Container() {
        this.currentCapacity = 0;
        this.maxCapacity = 100;

    }

    public void add(int amount) {
        if (amount >= 0) {
            if (this.currentCapacity + amount < this.maxCapacity) {
                this.currentCapacity += amount;
            } else {
                this.currentCapacity = 100;
            }
        }
    }
    
    public int getCapacity(){
        return this.currentCapacity;
    }

    public String getCurrentCapacity() {
        return currentCapacity + "/" + this.maxCapacity;
    }

    public int contains() {
        return currentCapacity;
    }

    public void remove(int amount) {
        if (this.currentCapacity - amount >= 0) {
            this.currentCapacity -= amount;
            return;
        }
        this.currentCapacity = 0;

    }

    @Override
    public String toString() {
        return this.getCurrentCapacity();
    }

}
