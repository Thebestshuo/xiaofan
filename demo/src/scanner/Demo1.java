package scanner;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        //创建一个扫描器对象，用于接收键盘数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("使用next方式接收：");
        //判断是否还有输入内容
        if (scanner.hasNext()){
            //使用next的方式获取键盘输入的内容
            String str = scanner.next();
            System.out.println("输入的内容为：" + str);
        }
        //凡是属于IO流的类，在使用完毕之后，都需要关闭，否则会占用系统资源，影响其他程序的使用
        scanner.close();
    }
}
