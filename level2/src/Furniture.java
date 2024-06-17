public class Furniture {
    private String type;
    private String material;
    private int price;
    public Furniture(String type, String material, int price){
        this.type = type;
        this.material = material;
        this.price= price;
    }
    public void discount(){
        float disc;
        if(material == "Wood"){
            disc = (float) 0.9 * price;
        }else{
            disc = (float) 0.8 * price;
        }
        System.out.printf("The discounted price is %.2f rupees",disc);
    }
    public void printInfo(){
        System.out.println("Furniture type: "+type);
        System.out.println("Furniture material: " + material);
        discount();
    }
    public static void main(String[] args) {
        Furniture furniture1 = new Furniture("Chair", "Wood", 1000);
        furniture1.printInfo();
    }
}
