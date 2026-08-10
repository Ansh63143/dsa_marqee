// import java.util.*;

//constructor chaining

class Student{
  String name;
  int roll;

  // this keyword
  // Student(String name, int roll){
  //   this.name = name;
  //   this.roll = roll;
  // }

  Student(String nm, int r){
    name = nm;
    roll = r;
  }
}

public class thisk {
    public static void main(String[] args) {
      Student s = new Student("anuj", 2);
      System.out.println(s.name);
    }
}