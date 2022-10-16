public class Main {
    public static void main(String[] args){
        BankAccount bk1 = new BankAccount("Kate", 1000);
        bk1.deposit(5000);
        bk1.withdraw(500);
        bk1.withdraw(500);
        System.out.println(bk1.getOwner());
        System.out.println(bk1.getBalance());

    }
}
