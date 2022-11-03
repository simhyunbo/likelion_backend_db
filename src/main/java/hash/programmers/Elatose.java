package hash.programmers;

import java.util.Arrays;

public class Elatose {
    public static void main(String[] args) {
        int N = 50; // N = 50
        int[] nums = new int[N - 1]; // N-1개만큼 2~50까지 총 49개
        boolean[] checks = new boolean[nums.length]; // nums만큼 checks생성
        Arrays.fill(checks, true); // checks를 true로 초기화 cuz 기본값 false
        for (int i = 0; i < nums.length; i++) nums[i] = i + 2; // 2~50까지 nums에 채우기


        //2의배수 지우기

        int multipleOf = 2;
        for (int i = 2; i < nums.length; i+=2) {
            checks[i] = false;
        }

        
        //checks를 참고해서 true인 num[i]만 출력
        for (int i = 0; i < checks.length; i++) {
            if(checks[i] == true){
                System.out.println(Arrays.toString(checks[i]));
            }
        }
    }
}


