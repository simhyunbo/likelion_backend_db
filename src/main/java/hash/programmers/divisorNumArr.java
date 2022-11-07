package hash.programmers;

import java.util.ArrayList;
import java.util.List;

public class divisorNumArr {
    //조건 %해서 0이면 list.add()
    // 오름차순으로 정렬
    // list 개수가 0이면 [-1], [5,10]

        public int[] solution(int[] arr, int divisor) {
            int[] answer = {};
            List<Integer> arrNum = new ArrayList<Integer>();
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] % divisor == 0){
                    arrNum.add(arr[i]);
                }
            }

            return answer;

        }

    public static void main(String[] args) {

    }
}
