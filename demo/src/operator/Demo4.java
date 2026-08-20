package operator;

public class Demo4 {
    public static void main(String[] args) {
        int a = 3;

        int b = a++;//先给b赋值，再给a加1
        System.out.println(a);
        System.out.println(b);
        int c = ++a;//先给a加1，再给c赋值
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        int d = (int) Math.pow(a,3);
        System.out.println(d);
    }
}
