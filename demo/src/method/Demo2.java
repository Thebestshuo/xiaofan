package method;

public class Demo2 {
    public static void main(String[] args) {
//        int max = max(10, 10);
//        System.out.println(max);
        System.out.println(max(10, 10));
        System.out.println(max(10, 20));
    }

    public static int max(int a, int b) {
        int result = 0;
        if (a == b) {
            System.out.println("两个值相等");
            return 0;//终止方法
        }
        if (a > b) {
            result = a;
        } else if (b > a) {
            result = b;
        }
        return result;
    }
}
