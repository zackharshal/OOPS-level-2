public class Dog {
    private final String breed;
    private final int age;
    private final float weight;
    public Dog(String breed, int age, int weight){
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }
    public void calculateHumanAge(){
        float humanAge = (float)(16 * Math.log(age) + 31);
        System.out.printf("The converted human age would be %.2f",humanAge);
    }
    public void printInfo(){
        System.out.println("Dog's breed: "+breed);
        System.out.println("Dog's age: " + age);
        System.out.println("Dog's weight: "+ weight);
    }
    public static void main(String[] args) {
        Dog dog1 = new Dog("German Shepherd", 8, 30);
        dog1.calculateHumanAge();
        System.out.println("");
        dog1.printInfo();
    }
}
