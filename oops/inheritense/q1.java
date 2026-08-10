import java.util.*;
class Mahindra{
    void XUV(){
        System.out.println("This is our brand");
    }
}
class EVs extends Mahindra{

}

public class q1 {
    public static void main(String[] args) {
        Mahindra Ev = new EVs();
        Ev.XUV();
    }
}
