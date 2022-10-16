public class Main {
    public static void main(String[] args){
        passwordChangeEvent eventOne = new passwordChangeEvent("1234567");
        AccountTransferEvent eventTwo = new AccountTransferEvent("2345678");
        MissedPaymentEvent eventThree = new MissedPaymentEvent("3456789");
        Event[] events = {eventOne, eventTwo, eventThree};

        for (Event e : events){
            System.out.println(e.getTimeStamp());
            e.process();
            System.out.println();
    }

    }
}
