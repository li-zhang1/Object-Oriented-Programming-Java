public class Main {
    public static void main(String[] args){
        Employee em1 = new Employee("Kate", 28, 80000, "NC");
        Employee em2 = new Employee("Mike", 30, 90000, "NY");
        em2.raiseSalary(10000);
        System.out.println(em1.getSalary());
        System.out.println(em2.getSalary());
    }
}
