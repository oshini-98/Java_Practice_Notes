class A{

    void show1(){
        System.out.println("in A show");
    }
}

class B extends A{

    void show2(){
        System.out.println("in B show");
    }
}


public class Casting {

    public static void main(String[] args) {
        A obj = new B();    // Upcasting 
        obj.show1();

        B obj1 = (B) obj;  // Downcasting
        obj1.show2();    
    }
}
