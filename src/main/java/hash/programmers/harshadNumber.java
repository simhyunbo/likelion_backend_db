package hash.programmers;

public class harshadNumber {
    


    public static void main(String[] args) {
        //1.자리수의 합 구하기
        //2.나누어 떨어지는지 check하기 ex)687/21 나누어 떨어지면 687은 하샤드 수

        int num = 687;
        String harNum = String.valueOf(num);
        String[] harArr = harNum.split("");
        int harshad = 0;
        for (int i = 0; i < harArr.length; i++) {
            harshad += Integer.parseInt(harArr[i]);
        }
        System.out.println(harshad);
    }
    
}
