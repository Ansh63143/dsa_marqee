// Constructor chaining avoids code duplication.
// this() chains constructors within the same class.
// super() chains constructors between parent and child classes.
// Both must be the first statement in a constructor

class Animals{
    Animals(String name){
        System.out.println("Animal constructor");
        System.out.println(name);
    }

}
class Dog extends Animals{
    Dog(){
        super("Tommy");
        System.out.println("Dog constructor");
        // System.out.println(name);
    }
}

public class superk {
    public static void main(String[] args)
    {
        Dog d = new Dog();
    }
}


// meta space