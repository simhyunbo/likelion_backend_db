package hash;

import java.util.HashMap;
import java.util.Map;

public class ARacer {

    public String solution(String[] participant, String[] completion) {
        //1.HashMap에 participant를 모두 넣습니다.
        //2.completion에 들어있는 이름을 key로 HashMap에 검색합니다. 있으면 0으로 check
        //3.memo를 한바퀴 돌면서 1인 값을 찾습니다.
        Map<String, Integer> memo = new HashMap<>();
        for (int i = 0; i < participant.length; i++) {
            String key = participant[i];
            memo.put(key, 1);
        }
        for (int i = 0; i < completion.length; i++) {
            String key = completion[i];
            memo.put(key, 0);
        }
        for (String key : memo.keySet()) {
            //get 매개변수 값이 존재하면 입력받은 값 리턴 , 존재하지 않으면 null리턴
            if (memo.get(key) == 1) {
                return key;
            }
        }
        return "";
    }


    public static void main(String[] args) {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

    }
}
