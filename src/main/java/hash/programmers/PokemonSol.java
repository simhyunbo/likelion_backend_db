package hash.programmers;

import java.util.HashSet;
import java.util.Set;

public class PokemonSol {
    public int solution(int[] nums) {


        Set<Integer> pokSet= new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            //add 를해서 중복을 제거한다
            pokSet.add(nums[i]);
        }
        //고르는 방법 고민중..

        return 0;
    }

    public static void main(String[] args) {

    }
}
