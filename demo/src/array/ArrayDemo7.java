package array;

import java.util.Arrays;

public class ArrayDemo7 {
    public static void main(String[] args) {
        int[] arr = {5, 7, 9, 13, 8, 1, 2};
        int[] arr2 = sort(arr);
        System.out.println(Arrays.toString(arr2));
    }

    //冒泡排序
    public static int[] sort(int[] arr) {
        //临时变量
        int temp;
        //外层循环，判断这个循环走多少次
        for (int i = 0; i < arr.length - 1; i++) {
            //通过flag标识位减少没有意义的比较
            boolean flag = false;
            //内层循环，如果第一个数比第二个数大，交换位置
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
        return arr;

    }
}
