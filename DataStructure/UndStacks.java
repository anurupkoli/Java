class Stacks{
    class Node{
        int data;
        Node next;
        Node(int d){
            this.data = d;
            this.next = null;
        }
    }
    public Node head;
    
    public boolean isEmpty(){
        return head == null;
    }

    public void push(int d){
        Node newNode = new Node(d);
        if(isEmpty()){
            head = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }

    public void pop(){
        if(isEmpty()) return;
        System.out.println(head.data + " popped out");
        head = head.next;
    }

    public void peek(){
        if(isEmpty()) System.out.println(-1);;
        System.out.println(head.data);
    }

    public void printStack(){
        if(isEmpty()) System.out.println("null");
        Node cuNode = head;
        System.out.print("[");
        while(cuNode!=null){
            System.out.print(cuNode.data + " ");
            cuNode = cuNode.next;
        }
        System.out.println("]");
    }
}

public class UndStacks {
    public static void main(String[] args) {
        Stacks st = new Stacks();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.pop();
        st.printStack();
    }
    
}
