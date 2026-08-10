class Student {
    String name;
    int age;

    Student() {
        name = "Ansh";
        age = 19;
    }

    void display() {
        System.out.println(name);
        System.out.println(age);
    }
}

    public class DefaluCOnstructor {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}
