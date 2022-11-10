package hash.programmers.Week8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class notSameNumber {

        public static void main(String[] args) {
            int[] arr = {1,1,3,3,0,1,1};
            ArrayList<Integer> answerList = new ArrayList<Integer>();
            int sameNum = 0;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] != sameNum) {
                    answerList.add(arr[i]);
                    sameNum = arr[i];
                }
            }
            System.out.println(answerList);
        }
}
