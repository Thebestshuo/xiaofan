package method;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Test1 test1 = new Test1();

        while (true) {
            System.out.println("------------------简易计算器------------------");
            System.out.println("请选择需要进行的操作：");
            System.out.println("1、加    2、减    3、乘    4、除    5、退出");
            int choice = scanner.nextInt();
            if (choice == 5) {
                System.out.println("退出成功");
                break;
            }
            System.out.println("请输入第一个数：");
            double a = scanner.nextDouble();
            System.out.println("请输入第二个数：");
            double b = scanner.nextDouble();

            switch (choice) {
                case 1:
                    test1.getSum(a, b);
                    System.out.println("两个数的和是：" + test1.getSum(a, b));
                    break;
                case 2:
                    test1.getDifference(a, b);
                    System.out.println("两个数的差是：" + test1.getDifference(a, b));
                    break;
                case 3:
                    test1.getProduct(a, b);
                    System.out.println("两个数的积是：" + test1.getProduct(a, b));
                    break;
                case 4:
                    test1.getQuotient(a, b);
                    System.out.println("两个数的商是：" + test1.getQuotient(a, b));
                    break;
            }
        }

    }

    public double getSum(double a, double b) {
        return a + b;
    }

    public double getDifference(double a, double b) {
        return a - b;
    }

    public double getProduct(double a, double b) {
        return a * b;
    }

    public double getQuotient(double a, double b) {
        return a / b;
    }
}
