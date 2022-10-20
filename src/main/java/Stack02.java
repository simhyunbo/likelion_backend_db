public class Stack02 {

    private Integer[] arr;
    private int top = 0;
    public Stack02(){
        this.arr = new Integer[10000];
    }

    public Stack02(int size){
        this.arr = new Integer[10000];
    }
    public void push(int value) {
        this.arr[top] =value;
        this.top ++;
    }

    public Integer[] getArr() {
        return arr;
    }

    public int pop() {
        int value = this.arr[--this.top];
        this.top --;
        return value;

    }
}
