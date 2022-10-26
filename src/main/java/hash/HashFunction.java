package hash;

import java.util.ArrayList;
import java.util.List;

public class HashFunction {
    class Node{
        private String key;
        private Integer value;
        public String getKey() {
            return key;
        }

        public Integer getValue() {
            return value;
        }

        public Node(String key, Integer value) {
            this.key = key;
            this.value = value;
        }
    }




    List<Node>[] table = new ArrayList[1000];
    public int hash(String key){
        int asciiSum = 0;
        for (int i = 0; i < key.length(); i++) {
            asciiSum += key.charAt(i);
        }
        System.out.println("asciiSum : "+asciiSum);
        return asciiSum % 100; //개수
    }

    public void insert(String key , int value){

        int hashIdx = hash(key);
        if (this.table[hashIdx] == null) { // null일 때 생성
            this.table[hashIdx] = new ArrayList<>();
        }
        // Map, Object
        this.table[hashIdx].add(new Node(key,value));
    }


    public Integer get(String key) {
        List<Node> nodes = this.table[hash(key)];
        for (Node node : nodes) {
            if (key.equals(node.getKey())) {
                return node.value;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        HashFunction hf = new HashFunction();
        hf.insert("Yoonseo",1);
        hf.insert("Seoyoon",2);

        int result = hf.get("Yoonseo");
        if(result == 1){
            System.out.println("테스트 성공");
        }else {
            System.out.println("테스트 실패"+ result);
        }
        result = hf.get("Seoyoon");
        if (result == 2) {
            System.out.println("테스트 성공");
        } else {
            System.out.println("테스트 실패"+ result);
        }
    }
}
