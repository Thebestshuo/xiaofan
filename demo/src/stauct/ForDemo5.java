package stauct;

public class ForDemo5 {
    public static void main(String[] args) {
        int [] sum = {1,2,3,4,5};
//        for (int i = 0; i < sum.length; i++){
//            System.out.println(sum[i]);
//        }
        for (int i : sum){
            System.out.println(i);
        }
    }
}
