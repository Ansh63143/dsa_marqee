class college{
    String name;
    int id;
    int age;
    String branch;

    void display(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Age: " + age);
        System.out.println("Branch: " + branch);
    }
}

public class oops {
    public static void main(String[] args) {
    college c1 = new college();
    c1.name = "John";
    c1.id = 101;
    c1.age = 20;
    c1.branch = "Computer Science";
    c1.display();
    }
}