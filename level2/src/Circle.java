import java.util.Scanner;

public class Circle {
    private int radius;
    public Circle(int radius){
        this.radius = radius;
    }
    public void calculateArea(){
        float area = (float) (Math.PI * radius * radius);
        System.out.printf("The area of circle is %.2f",area);
    }
    public void calculateCircumference(){
        float circumference = (float) (2 * Math.PI * radius);
        System.out.printf("The circumference is %.2f",circumference);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");
        int radius = scanner.nextInt();
        Circle c1 =new Circle(radius);
        c1.calculateArea();
        System.out.println("");
        c1.calculateCircumference();
    }
}
