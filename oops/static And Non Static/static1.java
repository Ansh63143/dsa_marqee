import java.util.*;
class Outer {
    static class Inner{
        void display(){
            System.out.println("INSIDE THE STATIC NESTED CLASS");
        }
        void view(){
            System.out.println("hi");
        }
    }
}

public class static1{
    public static void main(String[] args) {
        Outer.Inner obj = new Outer.Inner();
        obj.display();
        obj.view();
    }
}