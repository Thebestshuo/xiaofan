package scanner;

import java.util.Scanner;

public class Demo3 {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            int a = 0;
            float b = 0.0f;

            System.out.println("请输入一个整数：");
            if (scanner.hasNextInt()){
                a = scanner.nextInt();
                System.out.println("输入的整数数据是： " + a);
            }else {
                System.out.println("输入的不是整数数据");
            }

            System.out.println("请输入一个浮点数：");
            if (scanner.hasNextFloat()){
                b = scanner.nextFloat();
                System.out.println("输入的浮点数数据是： " + b);
            }else {
                System.out.println("输入的不是浮点数数据");
            }

            scanner.close();
        }
}
