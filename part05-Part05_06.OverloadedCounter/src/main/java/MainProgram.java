
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        Counter c1 = new Counter();
        System.out.println(c1.value());
        
        Counter c2 = new Counter(73);
        System.out.println(c2.value());
        
        c1.increase();
        System.out.println(c1.value());
        
        c2.increase(100);
        System.out.println(c2.value());
        
        System.out.println(c2);
        
        int value  = 5;
        System.out.println(value);
        
        value = 6;
        System.out.println(value);
        
    }
}
