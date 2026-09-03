package stauct;

public class ForDemo3 {
    public static void main(String[] args) {
//        int a = 0;
        for (int i = 1; i <= 1000; i++) {
            if(i%5==0){
                System.out.print(i+"\t");
//                a++;
////                if(a%3==0){
////                    System.out.println();
////                }
            }
            if(i%15==0){
                System.out.println();
            }
        }
    }
}
