package hash.programmers;

public class Print1TO100V2 {
    public static void print1To100(int num){
        //시작하는 값은 어떤 것인지
        //변화는 어떻게 줄 것인지 - print1To100(num + 1)
        //언제 끝낼 것인지
        if (num == 101) {
            return;
        }
        System.out.println(num);
        print1To100(num+1);
    }
    public static void main(String[] args) {
        print1To100(1);
    }
}
