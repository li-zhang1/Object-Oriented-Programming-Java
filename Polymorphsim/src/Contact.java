public class Contact {
    private String name;
    private phoneNumber phoneNumber;
    private String email;

    public Contact(String name, phoneNumber phoneNumber, String email){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;

    }
    public Contact(String name, phoneNumber phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;

    }

    public Contact(String name, String email){
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                '}';
    }
}
