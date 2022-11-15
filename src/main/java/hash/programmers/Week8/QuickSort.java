package hash.programmers.Week8;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {
    public static void main(String[] args) {
        var arr = new int[]{20,18,5,19,5,25,40,50};

        //1.기준값 뽑는 로직 구현
         int pivot = arr[arr.length/2];

        List<Integer> lowArr = new ArrayList<>();
        List<Integer> equalArr = new ArrayList<>();
        List<Integer> highArr = new ArrayList<>();
        // 2. 기준값 기준으로 왼쪽 오른쪽으로 나누어 담는 로직 구현
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<pivot){
                lowArr.add(arr[i]);
            }else if(arr[i]>pivot){
                highArr.add(arr[i]);
            }else{
                equalArr.add(arr[i]);
            }
        }

    }

}
