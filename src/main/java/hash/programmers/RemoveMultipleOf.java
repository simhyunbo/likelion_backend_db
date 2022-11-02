package hash.programmers;

import java.util.ArrayList;
import java.util.List;

public class RemoveMultipleOf {
    public static void main(String[] args) {
        int N = 50; //50미만의 모든 소수 구하기

        List<Integer> nums = new ArrayList<>();

        //2~50채우기

        for (int i = 2; i <= N ; i++) nums.add(i);

        for (int j = 2; j*j <= N ; j++) {
            //2의 배수 지우기 2 제외
            for (int i = 0; i < nums.size(); i++) {
                if(nums.get(i) % 2 == 0 && nums.get(i) > 2) {
                    nums.remove(i);
                }
             }
        }
    }
}
