package inheritensejava;

class MyInteger {
    private int value;

    MyInteger(int value) {
        this.value = value;
    }

    int getValue() {
        return value;
    }
}

public class wrapperclass {
    public static void main(String[] args) {
        MyInteger obj = new MyInteger(10);

        System.out.println(obj.getValue());
    }
}