public class AccountTransferEvent extends AbstractEvent{
    public AccountTransferEvent(String id) {
        super(id);
    }

    @Override
    public void process(){
        System.out.println("Customer " + id + " needs to transfer " +
                "their services. reaching out to CTE to remove " +
                "service form old device and ass service to new device.");

    }

}
