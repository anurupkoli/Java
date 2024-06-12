import java.util.*;
class OwnLinkedList{
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
    OwnLinkedList(){
        size = 0;
        head = null;
    }

    public void add(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = newNode;
            return;
        }

        head.next = newNode;
        head = newNode;
    }

    public int size(){
        return this.size;
    }
}

public class Que5 {
    public static void main(String[] args) {
        // LinkedList<Integer> list = new LinkedList<>();
        // list.add(5);
        // list.add(6);
        // list.add(7);
        // list.add(8);

        OwnLinkedList list = new OwnLinkedList();
        list.add(0);;
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(3);

        System.out.println(list.size());
    }
}
