package hash.programmers;

public class RecursionFib {

    public static int fib(int n){
        //n이 1이나 2가 들어오면 재귀를 안타고 return함
        if(n==1 | n ==2 ) return 1; //1일때 1 2일때 1

        return fib(n-1)+fib(n-2);
    }

    public static void main(String[] args) {
        int r = fib(6);
        System.out.println(r);
        // fib(4) = fib(3) + fib(2)
        //


    }
}
