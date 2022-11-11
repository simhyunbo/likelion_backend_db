package hash.programmers.Week8;

public class SecretMap {


    public static void main(String[] args) {
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        String[] strArr1 = new String[arr1.length];
        String[] strArr2 = new String[arr2.length];
        //2진법으로 변환
        for (int i = 0; i < arr1.length; i++) {
            strArr1[i] = Integer.toBinaryString(arr1[i]);
        }
        for (int i = 0; i < arr1.length; i++) {
            strArr2[i] = Integer.toBinaryString(arr2[i]);
        }






    }
}
