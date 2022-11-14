package hash.programmers;

public class Eratosthenes {
    public static void main(String[] args) {
        int N = 50;
        int[] arr = new int[N - 1]; // idx는 0~48 숫자는 2~50
        System.out.println(arr.length);

        // 2 ~ 50까지 값 채우기
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 2;
        }
        int i = 0;
        for (int j = arr[i]; j < arr.length; j++) { // arr.length = 49이므로 49미만까지
            arr[j] = 0;
        }
        System.out.printf("%d %d\n", 4, arr[4]);
        System.out.printf("%d %d\n", 5, arr[5]);
        System.out.printf("%d %d\n", 47, arr[47]);
        System.out.printf("%d %d\n", 48, arr[48]);
    }
}
