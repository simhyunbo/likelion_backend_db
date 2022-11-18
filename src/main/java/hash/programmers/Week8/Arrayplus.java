package hash.programmers.Week8;

public class Arrayplus {
    public static void main(String[] args) {
     int[][] arr1 = {{1,2},{2,3}};
     int[][] arr2 = {{3,4},{5,6}};
     int[][] arr3 = new int[2][2];
        System.out.println(arr1[0].length);
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                arr3[i][j] = arr1[i][j]+arr2[i][j];
            }
        }
        System.out.println(arr3[1][1]);

    }
}
