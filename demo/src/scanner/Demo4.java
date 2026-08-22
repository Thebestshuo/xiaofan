package scanner;

import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //和
        double sum = 0.0;
        //计算输入了多少数字
        int count = 0;
        //平均值
        double avg = 0.0;

        System.out.println("请输入数字：");

        while (scanner.hasNextDouble()){
            double x = scanner.nextDouble();
            count++;
            sum += x;
            avg = sum / count;
            System.out.println("你当前输入的是第"+count + "个数字，当前和是："+ sum + "，当前平均值是：" + avg );
        }
        System.out.println("输入的数字的和是：" + sum);
        System.out.println("输入的数字的平均值是：" + avg);

        scanner.close();
    }
}
