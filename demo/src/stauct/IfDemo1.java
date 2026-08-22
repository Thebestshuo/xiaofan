package stauct;

import java.util.Scanner;

public class IfDemo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入内容：");
        String str = scanner.nextLine();
        //equals 判断字符串是否相等
        if (str.equals("Hello")){
            System.out.println("你输入的是Hello");
        }
        System.out.println("你输入的不是Hello");
        scanner.close();
    }
}
