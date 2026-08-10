
class Animal{
    void eat(){
    System.out.println("Animal is eating ");
    }
}
class Dog extends Animal{

}

public class learn{
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.eat();
        }
}