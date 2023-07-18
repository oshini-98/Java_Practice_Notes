class Mobile
{
    String brand;
    int price;
    static String name;

    static
    {
        name = "Phone";
    }

    Mobile()
    {
        brand = " ";
        price = 1000;
    }

    void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }

    //  Inside a static method we cannot use non-static variables, but buy passing non-static variables using specific object is possible
    static void show1(Mobile obj){
        System.out.println(obj.brand + " : " + obj.price + " : " + name);
    }
}

public class StaticMethod 
{
    
    public static void main(String[] args) 
    {
        Mobile mobile1 = new Mobile();

        mobile1.brand = "Apple";
        mobile1.price = 1500;
        Mobile.name = "Smart Phone";

        mobile1.show();
        Mobile.show1(mobile1);
        
    }
}
