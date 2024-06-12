class StackArray{
    int[] arr;
    int size;
    int index;
    StackArray(int size){
        this.size = size;
        arr = new int[size];
        index = -1;
    }

    public void push(int data){
        if(index >= size){
            System.out.println("Stack is full");
            return;
        }
        index++;
        arr[index] = data;
    }

    public int pop(){
        if(index == -1){
            System.out.println("Stack is Empty");
            return -1;
        }
        int retData = arr[index];
        arr[index]  = 0;
        index--;
        return retData;
    }
}

public class Que7 {
    public static void main(String[] args) {
        StackArray stack = new StackArray(4);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        for (int i = 0; i < stack.size; i++) {
            System.out.print(stack.pop() + " ");
        }
    }
}
