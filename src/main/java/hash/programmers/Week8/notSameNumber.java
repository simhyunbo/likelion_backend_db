package hash.programmers.Week8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class notSameNumber {


        public int[] solution(int []arr) {
            ArrayList<Integer> answerList = new ArrayList<Integer>();
            for (int i = 0; i < arr.length; i++) {

                    answerList.add(arr[i]);

                }
            return arr;

        }

        public static void main(String[] args) {
            int[] arr = {1,1,3,3,0,1,1};
            notSameNumber narr = new notSameNumber();
            narr.solution(arr);
        }
}
