package stauct;

public class DoWhileDemo2 {
    public static void main(String[] args) {
        int a = 0;
        if (a < 0){
            System.out.println(a);
            a++;
        }
        do {
            System.out.println(a);
        }while (a < 0);
    }
}
