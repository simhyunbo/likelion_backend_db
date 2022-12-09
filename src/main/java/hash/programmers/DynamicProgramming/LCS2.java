package hash.programmers.DynamicProgramming;

public class LCS2 {
    public static void main(String[] args) {
        String str1 = "ABCDBA"; // 7개 안쪽 loop , 열
        String str2 = "DCABDC"; // 6개 바깥쪽 loop , 행
        //str2.length() * str1.length() 사이즈의 int 배열 만들기

        //str2인 DCABDC를 i로 놓고 바깥쪽에서 반복
        //str1인 ABCDBA를 j로 놓고 안쪽에서 반복

        int[][] dp = new int[str2.length()][str1.length()];

        for (int i = 0; i < str2.length(); i++) {
            for (int j = 0; j < str1.length(); j++) {

                System.out.printf("%s %s\n", str2.charAt(i),str1.charAt(j));
            }
        }
    }
}
