package operator;

public class Demo5 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        System.out.println(a&&b);
        System.out.println(a||b);
        System.out.println(!a);

        int c = 5;
        boolean d = (c<5)&&(c++<4);
        System.out.println(d);
        System.out.println(c);

        boolean e = (c<5)&(c++<4);
        System.out.println(e);
        System.out.println(c);
    }
}
