package hash.programmers;

import java.util.HashSet;

public class phoneBook {

    public boolean solution(String[] phone_book) {
        boolean answer = true;
        HashSet<String> hs = new HashSet<>();
        for(String num : phone_book) hs.add(num);


        return answer;
    }


    public static void main(String[] args) {
        String[] phone_book = {"119", "97674223", "1195524421"};
        HashSet<String> hs = new HashSet<>();
        for(String num : phone_book) hs.add(num);


        System.out.println(hs.toString());
    }
}
