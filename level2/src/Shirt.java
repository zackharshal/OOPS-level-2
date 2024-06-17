public class Shirt {
    private char size;
    private String color;
    private int price;
    public Shirt(char size, String color, int price){
        this.size = size;
        this.color = color;
        this.price = price;
    }
    public void discount(){
        float discountPrice;
        switch (size){
            case 'S':
                discountPrice = (float) 0.95 * price;
                break;
            case 'M':
                discountPrice = (float) 0.9 * price;
                break;
            case 'L':
                discountPrice = (float) 0.85 * price;
                break;
            default:
                discountPrice = (float) 0.96 * price;
        }
        System.out.printf("The discounted price is %.2f rupees",discountPrice);
    }
    public void printInfo(){
        System.out.println("Shirt size: "+size);
        System.out.println("Shirt color: " +color);
        discount();
    }
    public static void main(String[] args) {
        Shirt shirt1 = new Shirt('M', "Blue", 700);
        shirt1.printInfo();
    }
}
