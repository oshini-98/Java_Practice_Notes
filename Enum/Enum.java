package Enum;

//   *Same as class, but cannot extends from other

enum Status{
    Running, Failed, Pending, Success;
}


public class Enum {

    public static void main(String[] args) {
        int i = 5;
        Status s = Status.Pending;

        System.out.println(s);
        System.out.println(s.ordinal());

        Status[] ss = Status.values();

        System.out.println(ss[3]);

        for(Status a : ss){
            System.out.println(a + "    :    " + a.ordinal());
        }


        switch(s){
            case Running : 
                System.out.println("All Good");
                break;
            
            case Failed : 
                System.out.println("Try Again");
                break;
            
            case Pending : 
                System.out.println("Please Wait");
                break;
            
            default : 
                System.out.println("Done");
                break;
        }


    }
    
}