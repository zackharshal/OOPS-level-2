public class Phone {
    private String maker;
    private String model;
    private int storage;
    public Phone(String maker, String model, int storage){
        this.maker = maker;
        this.model = model;
        this.storage = storage;
    }
    public int price(){
        int totalPrice = 0;
        switch (maker){
            case "Apple":
                switch (model) {
                    case "12":
                        totalPrice += 60000;
                        if(storage == 128){
                            totalPrice += 2000;
                        }
                        if(storage == 256){
                            totalPrice += 4000;
                        }
                        break;
                    case "13":
                        totalPrice += 70000;
                        if(storage == 128){
                            totalPrice += 2000;
                        }
                        if(storage == 256){
                            totalPrice += 4000;
                        }
                        break;
                    case "14":
                        totalPrice += 80000;
                        if(storage == 128){
                            totalPrice += 2000;
                        }
                        if(storage == 256){
                            totalPrice += 4000;
                        }
                        break;
                    default:
                        System.out.println("This model does not exist in the system.");
                }
            case "Samsung":
                switch (model){
                    case "M":
                        totalPrice += 20000;
                        if(storage == 128){
                            totalPrice += 2000;
                        }
                        if(storage == 256){
                            totalPrice += 4000;
                        }
                        break;
                    case "A":
                        totalPrice += 30000;
                        if(storage == 128){
                            totalPrice += 2000;
                        }
                        if(storage == 256){
                            totalPrice += 4000;
                        }
                        break;
                    case "S":
                        totalPrice += 50000;
                        if(storage == 128){
                            totalPrice += 2000;
                        }
                        if(storage == 256){
                            totalPrice += 4000;
                        }
                        break;
                    default:
                        System.out.println("This model does not exist in the system.");
                }
            default:
                System.out.println("This model does not exist in the system");
        }
        return totalPrice;
    }
    public static void main(String[] args) {
        Phone p1 = new Phone("Apple", "14", 256);
        System.out.println("The total price is " + p1.price());
    }
}
