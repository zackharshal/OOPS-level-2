public class TV {
    private String brand;
    private int size;
    private int price;
    public TV(String brand, int size, int price){
        this.brand = brand;
        this.size = size;
        this.price = price;
    }
    public void discount(){
        float discount;
        switch (size) {
            case 32:
                discount = (float) 0.95 * price;
                break;
            case 50:
                discount = (float) 0.9 * price;
                break;
            case 60:
                discount = (float) 0.85 * price;
                break;
            default:
                discount = price;
        }
        System.out.printf("The discounted price of the TV is %.2f",discount);
    }
    public void printInfo(){
        System.out.println("Brand: "+ brand);
        System.out.println("Size: " + size);
        System.out.println("Price: " + price);
        discount();
    }
    public static void main(String[] args) {
        TV tv1 = new TV("Sony", 50, 45000);
        tv1.printInfo();
    }
}
