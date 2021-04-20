
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        MessagingService messenger = new MessagingService();
        Message message = new Message("b0aty", "73");
        messenger.add(message);
        System.out.println(messenger.getMessages());
    }
}
