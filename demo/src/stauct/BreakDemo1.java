package stauct;

public class BreakDemo1 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 100){
            i++;
            System.out.println(i);
            if (i == 30){
                break;
            }
        }
        System.out.println("程序结束");
    }
}
