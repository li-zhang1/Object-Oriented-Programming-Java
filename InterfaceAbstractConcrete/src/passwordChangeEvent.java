public class passwordChangeEvent extends AbstractEvent{
    public passwordChangeEvent(String id){
        super(id);
    }
    @Override
    public void process(){
        System.out.println("Customer " + id + " change their password. " + "Sending a confirmation email to the customer.");
    }

}
