package array;

public class ArrayDemo8 {
    public static void main(String[] args) {
        //定义一个二维数组11*11，0：没有棋子，1：黑子，2：白子
        int[][] arr1 = new int[11][11];
        arr1[1][2] = 1;
        arr1[2][3] = 2;

        //输出原始的数组
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

        //转换为稀疏数组
        //获取有效值的个数
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                if (arr1[i][j] != 0) {
                    count++;
                }
            }
        }
        System.out.println("有效值的个数为：" + count);

        //创建稀疏数组
        int[][] arr2 = new int[count + 1][3];
        arr2[0][0] = arr1.length;
        arr2[0][1] = arr1[0].length;
        arr2[0][2] = count;

        //遍历二维数组，将非零的值，存放在稀疏数组中
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                if (arr1[i][j] != 0) {
                    sum++;
                    arr2[sum][0] = i;
                    arr2[sum][1] = j;
                    arr2[sum][2] = arr1[i][j];
                }
            }
        }

        //输出稀疏数组
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i][0] + "\t" + arr2[i][1] + " \t" + arr2[i][2]);
        }

        //将稀疏数组恢复为原始数组
        //读取稀疏数组的值
        int[][] arr3 = new int[arr2[0][0]][arr2[0][1]];

        //遍历稀疏数组，将非零的值，恢复到原始数组中
        for (int i = 1; i < arr2.length; i++) {
            arr3[arr2[i][0]][arr2[i][1]] = arr2[i][2];
        }

        //输出恢复后的数组
        for (int[] a : arr3) {
            for (int b : a) {
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}
