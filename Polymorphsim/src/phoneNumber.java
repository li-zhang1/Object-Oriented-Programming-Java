public class phoneNumber {
    private int countryCode;
    private String phoneNumber;
    public phoneNumber(String phoneNumber){
        if (phoneNumber.length() > 10){
            this.countryCode = Integer.parseInt(phoneNumber.substring(0, phoneNumber.length() - 10));
            this.phoneNumber = phoneNumber.substring(phoneNumber.length()-10);
        }else{
            this.countryCode = 1;
            this.phoneNumber = phoneNumber;
        }
    }

    public phoneNumber(int countryCode, String phoneNumber){
        this.countryCode = countryCode;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "phoneNumber{" +
                "countryCode=" + countryCode +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
