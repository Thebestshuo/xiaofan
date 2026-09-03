package method;

public class Demo3 {
    public static void main(String[] args) {
        System.out.println(min(10.0, 20.0));
    }
    public static int min(int a,int b){
        int result = 0;
        if (a == b){
            result = 0;
            System.out.println("两个值相等");
        }else if (a < b){
            result = a;
        }else if (b < a){
            result = b;
        }
        return result;
    }
    public static double min(double a,double b){
        double result = 0;
        if (a == b){
            result = 0;
            System.out.println("两个值相等");
        }else if (a < b){
            result = a;
        }else if (b < a){
            result = b;
        }
        return result;
    }
}
