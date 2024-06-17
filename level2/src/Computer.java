public class Computer {
    private String processor;
    private int ram;
    private int storage;
    public Computer(String processor, int ram, int storage){
        this.processor = processor;
        this. ram = ram;
        this.storage = storage;
    }
    public void addInfo(){
        int price = 0;
        if(processor == "Intel"){
            price += 10000;
            if(ram == 16){
                price += 6500;
                if(storage == 1){
                    price += 6500;
                } else if (storage == 2) {
                    price += 15000;
                }
            } else if (ram == 32) {
                price += 10000;
                if(storage == 1){
                    price += 6500;
                } else if (storage == 2) {
                    price += 15000;
                }
            }
        } else if (processor == "Rizen") {
            price+=10000;
            if(ram == 16){
                price += 6500;
                if(storage == 1){
                    price += 6500;
                } else if (storage == 2) {
                    price += 15000;
                }
            } else if (ram == 32) {
                price += 10000;
                if(storage == 1){
                    price += 6500;
                } else if (storage == 2) {
                    price += 15000;
                }
            }
        }
        System.out.println("The total building cost would be "+ price);
    }
    public void printInfo(){
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + ram);
        System.out.println("Storage: "+ storage);
        addInfo();
    }
    public static void main(String[] args) {
        Computer comp1 = new Computer("Intel", 16, 1);
        comp1.printInfo();
    }
}
