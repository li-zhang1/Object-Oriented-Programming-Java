public class Main {
    public static void main(String[] args){
        Contact contact1 = new Contact("Kate", new phoneNumber("1123456789"), "123@gmail.com");
        Contact contact2 = new Contact("Mike", new phoneNumber("112322345678"));
        Contact contact3 = new Contact("Bill", "456@gmail.com");
        System.out.println(contact1);
        System.out.println(contact2);
        System.out.println(contact3);
    }
}
// Compile-time Polymorphsim-overloading
