public class Student {
    String name;
    int age;
    int id;

    public Student(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
        System.out.println("Name: "+this.name+"\nAge: "+this.age+"\nID: "+this.id);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Nikhil", 15, 1234);
    }
}