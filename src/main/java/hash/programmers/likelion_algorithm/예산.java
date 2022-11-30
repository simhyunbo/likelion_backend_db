package hash.programmers.likelion_algorithm;

import java.util.Arrays;

public class 예산 {


        public static int solution(int[] d, int budget) {
            int answer = 0;
            Arrays.sort(d);
            for (int i = 0; i < d.length; i++) {
                    if(budget>=d[i]){
                        System.out.println("d[i] : "+d[i]);
                        budget -= d[i];
                        answer++;
                    }
            }
            return answer;
        }

    public static void main(String[] args) {

            int[] arr = {1,3,2,5,4};
            solution(arr,9);



    }
}
