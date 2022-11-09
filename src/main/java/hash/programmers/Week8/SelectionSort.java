package hash.programmers.Week8;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 4, 9, 10, 223, 111, 23, 3, 39};

        

        //arr[0]번째에 들어갈 값 찾기
        //그 값이 들어있는 index 찾기 -- 0

        int min = arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            int minIdx = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[minIdx] > arr[j]){
                    minIdx = j;
                }

            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;

            System.out.println(Arrays.toString(arr));
        }





        //arr[1]번째에 들어갈 값 찾기
        //그 값이 들어있는 index 찾기 -- 8


    }
}
