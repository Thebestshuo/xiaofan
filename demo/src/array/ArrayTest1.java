package array;

public class ArrayTest1 {
    public static void main(String[] args) {
        int[][] array1 = new int[11][11];
        array1[5][6] = 1;
        array1[6][5] = 2;
        array1[9][9] = 1;

        //输出原数组
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("-----------------------------------------------------------");

        //确定有效值个数
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                if (array1[i][j] != 0) {
                    count++;
                }
            }
        }
        System.out.println("有效值个数为：" + count);

        System.out.println("-----------------------------------------------------------");

        //创建稀疏数组
        int[][] array2 = new int[count + 1][3];
        array2[0][0] = array1.length;
        array2[0][1] = array1[0].length;
        array2[0][2] = count;

        //遍历二维数组，将非零的值，存放在稀疏数组中
        int sum = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                if (array1[i][j] != 0) {
                    sum++;
                    array2[sum][0] = i;
                    array2[sum][1] = j;
                    array2[sum][2] = array1[i][j];
                }
            }
        }

        //输出稀疏数组
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i][0] + "\t" + array2[i][1] + "\t" + array2[i][2]);
        }

        //将稀疏数组恢复为原始数组
        int[][] array3 = new int[array2[0][0]][array2[0][1]];
        for (int i = 1; i < array2.length; i++) {
            array3[array2[i][0]][array2[i][1]] = array2[i][2];
        }

        System.out.println("-----------------------------------------------------------");

        //输出恢复后的数组
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++) {
                System.out.print(array3[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
