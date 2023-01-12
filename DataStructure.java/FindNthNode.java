class LinkedList2{
    class Node{
        int data;
        Node next;
        Node(int d){
            this.data = d;
            next = null;
        }
    }

    Node head;
    int size;
    LinkedList2(){
        this.size = 0;
    }

    public void add(int d){
        Node newNode = new Node(d);
        if(head == null) {
            head = newNode;
            size++;
        }
        else{
            newNode.next = head;
            head = newNode;
            size++;
        }
    }

    public void printList(){
        Node currNode = head;
        System.out.print("[");
        while(currNode != null){
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.print("]\n");
    }

    public int getSize(){
        Node currNode = head;
        int size = 0;
        while(currNode != null){
            size++;
            currNode = currNode.next;
        }
        return size;
    }

    public void nthNodeLastDelete(int n){
        Node currNode = head;
        Node tempNode = head.next;
        int reqSize = this.size - n;
        if(n == this.size){
            System.out.println(currNode.data);
            head = head.next;
            this.size--;
            return;
        }

        for(int i=0; i<reqSize-1; i++){
            currNode = currNode.next;
            tempNode = tempNode.next;
        }
        
        System.out.println(tempNode.data);
        currNode.next = tempNode.next;
        this.size--;
    }
}

public class FindNthNode {
    public static void main(String[] args) {
        LinkedList2 ll = new LinkedList2();
        ll.add(11);
        ll.add(22);
        ll.add(33);
        ll.add(44);
        ll.nthNodeLastDelete(1);
        ll.printList();
        // System.out.println(ll.getSize());
    }
}
