package inheritensejava;

class MyInteger{
  int value; // 10

  MyInteger(int value){
    this.value = value;
  }

  void increment(){
    value++;
  }

  void decrement(){
    value--;
  }

  void display(){
    System.out.println(value);
  }
}

public class raperclass {
    public static void main(String[] args) {
      MyInteger a = new MyInteger(10);
      a.increment();
      a.increment();
      // a.display();
      a.decrement();
      a.display();
    }
}