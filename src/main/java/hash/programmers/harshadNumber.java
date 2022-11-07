package hash.programmers;

public class harshadNumber {

//    public boolean solution(int x) {
//
//        // 자릿수 합
//        int sumOfDigit = 0;
//        while (x > 0) {
//            sumOfDigit += x % 10;
//            x = x / 10;
//        }
//        System.out.println(sumOfDigit);
//        return false;
//    }

    public int harshadNum(int num){
        String harNum = String.valueOf(num);
        String[] harArr = harNum.split("");
        int harshad = 0;
        for (int i = 0; i < harArr.length; i++) {
            harshad += Integer.parseInt(harArr[i]);
        }
        return harshad;
    }
    public boolean hardsolutuin(int num){
        boolean answer = false;
        String harNum = String.valueOf(num);
        String[] harArr = harNum.split("");
        int harshad = 0;
        for (int i = 0; i < harArr.length; i++) {
            harshad += Integer.parseInt(harArr[i]);
        }
        if(num%harshad == 0){
            return true;
        }
        return answer;
    }

    public static void main(String[] args) {
        //1.자리수의 합 구하기
        //2.나누어 떨어지는지 check하기 ex)687/21 나누어 떨어지면 687은 하샤드 수
        harshadNumber hs = new harshadNumber();
        int num = 21;
        System.out.println(hs.hardsolutuin(num));


    }
    
}
