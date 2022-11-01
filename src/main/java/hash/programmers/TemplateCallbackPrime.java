package hash.programmers;

public class TemplateCallbackPrime {
    boolean someOperation(int a, int b) {
        return a < b;
    }

    boolean isPrime(int num){
        // i < num
        // i < num/2
        // i*i < num  i * i 쓰는이유 i*i<num == i<Math.sqrt(num)
        for (int i = 2; someOperation(i,num); i++) {
            if(num%i == 0 ) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        TemplateCallbackPrime tcp = new TemplateCallbackPrime();
        boolean b = tcp.isPrime(17);
        System.out.println(b);
    }
}
