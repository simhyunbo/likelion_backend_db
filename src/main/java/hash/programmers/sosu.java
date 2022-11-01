package hash.programmers;

public class sosu {

    //소수란? 1과 자기 자신 외에 나누어 떨어지는게 없는 수
    //실습1 13,17,19,23 이 소수인지 판별하는 알고리즘

    public boolean isPrime(int num){
        boolean prime = true;
        for (int i = 2; i < num; i++) {
            if(num%i==0){
                prime = false;
                return prime;
            }
            return prime;
        }


        return prime;

    }

    public static void main(String[] args) {
        sosu s = new sosu();
        System.out.println(s.isPrime(13));

    }


}
