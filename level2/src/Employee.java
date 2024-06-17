import java.util.Scanner;

public class Employee {
    private String name;
    private int salary;
    private int id;
    public Employee(String name, int salary, int id){
        this.name = name;
        this.salary = salary;
        this.id = id;
        printInfo();
    }
    public void printInfo(){
        System.out.println("Employee name: "+name+"\nEmployee ID: "+id);
        System.out.println("Employee Annual Salary: "+(salary*12));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employees name: ");
        String name = scanner.nextLine();
        System.out.print("Enter employees monthly salary: ");
        int salary = scanner.nextInt();
        System.out.print("Enter employees id: ");
        int id = scanner.nextInt();

        Employee e1 = new Employee(name,salary,id);
    }
}
