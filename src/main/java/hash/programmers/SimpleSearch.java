package hash.programmers;

public class SimpleSearch {
    public static void main(String[] args) {

        //n개의 데이터가 있을 때, 특정 데이터가 어떤 위치에 있는지 구하기
        int[] simple = {2, 3, 7, 4, 9, 10, 223, 111, 23, 39};
        int cnt = 0;
        int simplenum = 111;
        for (int i = 0; i < simple.length; i++) {
            if(simplenum == simple[i]){
                cnt = i+1;
            }
        }
    }
}
