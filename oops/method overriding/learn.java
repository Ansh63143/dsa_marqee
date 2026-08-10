class Animal{
    void sound(){
        System.out.println("hi these side human");      
    }
}

class Lion extends Animal{
    @Override
    void sound(){
        System.out.println("Hi this is a jungle king");
    }
}

public class learn{
    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound();
        Lion lion = new Lion();
        lion.sound();
    }
}
