// MY TESTS
//public class MainProgram {
//
//    public static void main(String[] args) {
//        
        // test your class here
//        Money a = new Money(10, 0);
//        System.out.println(a + ", I'm immutable, i.e. this object's amount can't be changed because my values were declared as \"final\"");
//        
//        Money b = new Money(5,0);
//        
//        Money c = a.plus(b);
//        System.out.println(c);

//        Money firstMoneyObject = new Money(1, 0);
//        System.out.println(firstMoneyObject);
//
//        Money secondMoneyObject = new Money(1, 50);
//        System.out.println(secondMoneyObject);
//         Money thirdMoneyObject = new Money(-3,5);
//         System.out.println(thirdMoneyObject);
        // Money fourthMoneyObject = new Money(2,0);
        // System.out.println(fourthMoneyObject);
//        //System.out.println(firstMoneyObject.lessThan(thirdMoneyObject));
//        System.out.println(firstMoneyObject.lessThan(secondMoneyObject));
////        System.out.println(firstMoneyObject.lessThan(thirdMoneyObject));
//        System.out.println(secondMoneyObject.minus(firstMoneyObject));
        //  expected:<2> but was:<3>
//        Money firstMoneyObject = new Money(10, 0);
//        Money secondMoneyObject = new Money(7, 40);
//        Money firstMinusSecond = firstMoneyObject.minus(secondMoneyObject);
//        System.out.println(firstMinusSecond.euros());
//        System.out.println(firstMinusSecond.cents());
        // Remember that a Money cannot have a negative value: test the code 
//        Money firstMoneyObject = new Money(1, 0);
//        Money secondMoneyObject = new Money(2, 0);
//        Money firstMinusSecond = firstMoneyObject.minus(secondMoneyObject);
//        System.out.println(firstMinusSecond.cents());
//    }
//}

// GOYA CHOCOLATE
public class MainProgram {
 
    public static void main(String[] args) {
        // test your class here
//        Money a = new Money(52, 0);
//        Money b = new Money(60, 75);
// 
//        System.out.println(a.euros() + "." + a.cents() + "e");
//        System.out.println(b.euros() + "." + b.cents() + "e");
// 
//        Money c = a.minus(b);
// 
//        System.out.println(c.euros() + "." + c.cents() + "e");
// 
//        System.out.println(a);  // 10.00e
//        System.out.println(b);  // 3.50e
//        System.out.println(c);  // 6.50e
// 
//        System.out.println("");
// 
//        c = c.minus(a);       // NB: a new Money object is created, and is placed "at the end of the strand connected to c"
//                              //  the old 6.5 euros at the end of the strand disappears and the Java garbage collector takes care of it
// 
// 
//        System.out.println(a);  // 10.00e
//        System.out.println(b);  // 3.50e
//        System.out.println(c);  // 0.00e
// 
//        System.out.println("");
// 
//        System.out.println(a.euros() + "." + a.cents() + "e");
//        System.out.println(b.euros() + "." + b.cents() + "e");
//        System.out.println(c.euros() + "." + c.cents() + "e");

//        Money firstMoneyObject = new Money(1, 0);
//        Money secondMoneyObject = new Money(2, 0);
//        Money firstMinusSecond = firstMoneyObject.minus(secondMoneyObject);
//        firstMinusSecond.euros(); // expected:<0> but was:<-1>

//          Money firstMoneyObject = new Money(2, 50);
//          Money secondMoneyObject = new Money(2, 0);
//          Money firstMinusSecond = firstMoneyObject.minus(secondMoneyObject);
//          System.out.println(firstMinusSecond.cents() ); // expected:<50> but was:<0>
//            Money firstMoneyObject = new Money(10, 0);
//            Money secondMoneyObject = new Money(2, 0);
//            Money tennerMinusTwoEuros = firstMoneyObject.minus(secondMoneyObject);
//            System.out.println(tennerMinusTwoEuros.euros() );// expected:<8> but was:<2>
            Money firstMoneyObject = new Money(2, 50);
            Money secondMoneyObject = new Money(2, 0);
            Money firstMinusSecond = firstMoneyObject.minus(secondMoneyObject);
            System.out.println(firstMinusSecond.cents());  // expected:<50> but was:<0
          
    }
}
 