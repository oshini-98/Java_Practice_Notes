//  Lambda expressions works only with functional interface.
// Functional interface  -->  Interface that has one function


@FunctionalInterface
interface A {
    void show(int i);
}

interface B {
    int add(int i, int j);
}


public class LambdaExpression {

    public static void main(String[] args) {

        // Original Syntax --> A obj = (j) -> {System.out.println("in show" + j)};
        A obj = j -> System.out.println("in show  : " + j);
        obj.show(5);


        B obj1 = (i, j) -> i+j;
        int result = obj1.add(3, 7);
        System.out.println(result);
    }
    
}