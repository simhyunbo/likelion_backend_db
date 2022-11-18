package hash.programmers.Week8;

public class CaesarCipher {
    public static void main(String[] args) {
        //문자열 1칸 밀기
        String answer ="";
        int CaesarNum = 1;
        String str = "ABCDE";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.println(ch);
            if(ch>='a' && ch<='z'){
                if(ch+CaesarNum > 'z'){

                }
            }

        }

    }
}
