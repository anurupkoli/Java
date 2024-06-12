class StackLinkedList{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    int size;
    Node head;
    StackLinkedList(){
        size = 0;
        head = null;
    }

    public void  push(int data){
        size++;
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public int pop(){
        int data = head.data;
        head = head.next;
        return data;
    }

    // public int pop(){
        
    // }
}

public class Que8 {
    public static void main(String[] args) {
        StackLinkedList list = new StackLinkedList();
        list.push(0);
        list.push(1);
        list.push(2);
        list.push(3);
        for (int i = 0; i < list.size; i++) {
            System.out.print(list.pop() + " ");
        }
    }
}
