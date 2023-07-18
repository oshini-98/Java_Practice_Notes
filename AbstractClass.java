//   *  Abstract class can have abstract methods and normal methods
//   *  Abstract method should be inside of abstract class
//   *  All abstract method should implement inside the child class


abstract class Car{
    public abstract void drive();
    public abstract void fly();

    public void playMusic(){
        System.out.println("Play Music...");
    }

}

abstract class WagonR extends Car{
    public void drive(){
        System.out.println("Drive...");
    }

}

class UpdatedWagonR extends WagonR{             // concrete class

    @Override
    public void fly() {
        System.out.println("Flying...");
    }
}

public class AbstractClass {

    public static void main(String[] args) {
        Car obj = new UpdatedWagonR();
        obj.drive();
        obj.fly();
        obj.playMusic();
    }
}
