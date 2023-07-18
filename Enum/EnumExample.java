package Enum;

enum Laptop{
    Macbook(2000), XPS, Serface(1500), thinkpad(1200);

    private int price;

    private Laptop() {
        price = 9000;
    }

    private Laptop(int price) {
        this.price = price;
        System.out.println("In aptop" + this.name());
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}


public class EnumExample {
    public static void main(String[] args) {
        
        Laptop lap = Laptop.XPS;

        System.out.println(lap + " : " + lap.getPrice());

        for(Laptop l : Laptop.values()){
            System.out.println(l + "  :  " + l.getPrice());
        }
    }
}
