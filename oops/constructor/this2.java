class Student{
  String name;
  int roll;

  Student(){
    this("anuj", 2);
  }

  Student(String name, int roll){
    this.name = name;
    this.roll = roll;
  }
}

public class this2 {
    public static void main(String[] args) {
      Student s = new Student();
      System.out.println(s.name);
    }
}