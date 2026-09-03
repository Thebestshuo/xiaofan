package array;

import java.util.Arrays;

public class ArrayDemo6 {
    public static void main(String[] args) {
        int[] arr = {11, 2313, 3313, 4, 54, 51321, 6589, 6467, 8233, 31319, 11310};
//        System.out.println(Arrays.toString(arr));//打印数组元素
//        printArray(arr);
//       Arrays.sort(arr);
//        Arrays.fill(arr,2,4,100);
        System.out.println(Arrays.toString(arr));
    }

    //重复造轮子
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                System.out.print("[");
            }
            if (i == arr.length - 1) {
                System.out.print(arr[i] + "]");
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
    }
}
