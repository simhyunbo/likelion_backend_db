package hash.programmers;

public class Print1TO100V2 {
    public static void print1To100(int num){
        if (num == 100) {
            return;
        }
        System.out.println(num);
        print1To100(num);
    }
    public static void main(String[] args) {
        print1To100(1);
    }
}
