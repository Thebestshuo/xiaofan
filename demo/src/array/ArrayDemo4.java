package array;

public class ArrayDemo4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
//        for (int i : arr) {
//                System.out.println(i);
//        }
//        printArray(arr);
        printArray(reverse(arr));
    }

    //打印数组元素
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    //反转数组
    public static int[] reverse(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
            result[i] = arr[j];
        }
        return result;
    }
}
