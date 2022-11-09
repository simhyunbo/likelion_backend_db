package hash.programmers.Week8;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 4, 9, 10, 223, 111, 23, 3, 39};

        
        int i = 0;
        //arr[0]번째에 들어갈 값 찾기
        //그 값이 들어있는 index 찾기 -- 0
        int minIdx = 0;
        int min = arr[0];
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] < min){
                min = arr[j];
            }
        }
        System.out.println(min);

        i = 1;
        //arr[1]번째에 들어갈 값 찾기
        //그 값이 들어있는 index 찾기 -- 8


    }
}
