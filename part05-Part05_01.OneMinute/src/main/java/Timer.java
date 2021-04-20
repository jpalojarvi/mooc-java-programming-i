
public class Timer {
    private ClockHand seconds;
    private ClockHand hundreths;
    
    public Timer(){
        this.seconds = new ClockHand(60);
        this.hundreths = new ClockHand(100);
    }
    
    @Override
    public String toString(){
        return (this.seconds + ":" + this.hundreths);
    }
    
    public void advance(){
        this.hundreths.advance();
        
        if (this.hundreths.value() == 0){
            this.seconds.advance();
        }
    }
}
