public class Employee {
    private String name;
    private int age;
    private double salary;
    private String location;

    public Employee(String name, int age, double salary, String location){
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.location = location;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }
    public void setAge(){
        this.age = age;
    }

    public double getSalary(){
        return this.salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }

    public String getLocation(){
        return this.location;
    }
    public void setLocation(String location){
        this.location = location;
    }

    public void raiseSalary(double money){
        this.salary =  this.salary + money;
    }

}
