package hash.programmers;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {


    int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
    int mididx = 0;
    // 중간값 찾기 - 배열을 정렬한뒤 중간에있는 인덱스값 찾기
        if(nums.length % 2 == 0){
            mididx = nums.length/2;
        }else {
            mididx = nums.length/2 +1;
        }
        Arrays.sort(nums);

    
    // 인덱스(시작점, 끝점) 옮기기

    // 같은지 비교하기
    }
}

