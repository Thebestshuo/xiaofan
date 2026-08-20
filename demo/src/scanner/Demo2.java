package scanner;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的年龄：");
        if (scanner.hasNextLine()){
            String age = scanner.nextLine();
            System.out.println("你的年龄是：" + age);
        }
        scanner.close();
    }
}
