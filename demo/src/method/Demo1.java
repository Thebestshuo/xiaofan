package method;

public class Demo1 {
    public static void main(String[] args) {
        //实参
        int add = add(10, 20);
        System.out.println(add);
        cfb();
    }

    //形参
    public static int add(int a, int b) {
        return a + b;
    }

    //打印九九乘法表
    public static void cfb() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%dx%d=%-4d", j, i, i * j);
            }
            System.out.println();
        }
    }
}
