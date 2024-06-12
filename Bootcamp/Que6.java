import java.util.*;

class OwnLinkedList2{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head;
    OwnLinkedList2(){
        this.head = null;
    }

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void  printList(){
        Node curNode = head;
        System.out.print("(");
        while(curNode != null){
            System.out.print(curNode.data + "->");
            curNode = curNode.next;
        }
        
        System.out.print("null)");
    }
}
public class Que6 {
    public static void main(String[] args) {
        int a = 45;
        int b = 345;

        // LinkedList<Integer> list = new LinkedList();
        OwnLinkedList2 list2 = new OwnLinkedList2();

        int c = a + b;

        while(c > 0){
            list2.addFirst(c%10);
            c = c/10;
        }

        list2.printList();
    }
}
