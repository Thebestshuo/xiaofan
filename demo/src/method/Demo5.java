package method;

public class Demo5 {
    public static void main(String[] args) {
        Demo5 demo5 = new Demo5();
        demo5.printMax(10.0, 20.0, 30.0, 40.0, 50.0);
        demo5.printMax();
        demo5.printMax(new double[]{78.0, 23.0, 88.0, 46.0, 55.0});
    }

    public void printMax(double... b) {
        if (b.length == 0) {
            System.out.println("没有参数");
            return;
        }

        double result = b[0];

        for (int i = 1; i < b.length; i++) {
            if (b[i] > result) {
                result = b[i];
            }
        }
        System.out.println("最大数：" + result);
    }

}
