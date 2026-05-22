public class precidence {
     public static void main(String[] args) {
        System.out.println(10+30*3);
        System.out.println(10+40 / 5*2);
        System.out.println();
        System.out.println( 2+3 *4 % 5);
        System.out.println( 5 > 3 || 15>50 &&2<1);
        System.out.println('A' + 'B');
        System.out.println("A" + 'B');
        System.out.println("Hello"+(20+30));

        byte b1 = 127;
        System.out.println(++b1);
    }
}