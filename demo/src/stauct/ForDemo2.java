package stauct;

public class ForDemo2 {
    public static void main(String[] args) {
        int oddSum = 0;
        int evenSum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0){
                oddSum += i;
            }else {
                evenSum += i;
            }
        }
        System.out.println("1-100的奇数和是：" + oddSum);
        System.out.println("1-100的偶数和是：" + evenSum);
    }
}
