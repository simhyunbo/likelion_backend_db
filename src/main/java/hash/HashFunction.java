package hash;

public class HashFunction {
    public int hash(String key){
        int asciiSum = 0;
        for (int i = 0; i < key.length(); i++) {
            asciiSum += key.charAt(i);
        }
        System.out.println("asciiSum : "+asciiSum);
        return asciiSum % 100; //개수
    }
    public static void main(String[] args) {
        HashFunction hf = new HashFunction();
        hf.hash("sim");
    }
}
