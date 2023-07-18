//  * Every class in java is extend by Object class
//  Bellow example A class is extended from Object class. B is not. Object class --> A class --> B class  
//  this()        -->  Execute the constructor of the same class
//  In every Constructor, super() is executing buy default
//  super()       -->  Execute Parent class constructor
//  super(n)  -->  by passing arguments to supper(), we can execute parameterized constructor of the parent class


class A{
    A(){
        super();
        System.out.println("in A");
    }

    A(int n){
        super();
        System.out.println("in A int");
    }
}

class B extends A{
    B(){
        super();
        System.out.println("in B");
    }

    B(int n){
        this();
        System.out.println("in B int");
    }
}

public class SuperKeyWord {
    public static void main(String[] args) {
        new B(5);
    }
}
