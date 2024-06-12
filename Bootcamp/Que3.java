class LinkedLists{
    class Node{
        int data;
        Node next;
        Node(int d){
            this.data = d;
            this.next = null;
        }
    }
    private int size;
    LinkedLists(){
        this.size = 0;
    }
    public Node head;
    public Node tail;

    public void add(int d){
        Node newNode = new Node(d);
        if(head == null){
            head = newNode;
        }
        else{
            head.next = newNode;
        }
        size++;
    }

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null ){
            head = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            size++;
            return;
        }
        else{
            Node currNode = head;
            while(currNode.next != null){
                currNode = currNode.next;
            }
            currNode.next = newNode;
            size++;
        }
    }

    public void deleteFirst(){
        head = head.next;
        size--;
    }

    public void deleteLast(){
        Node secondLast = head;
        Node last = head.next;
        while(last.next != null){
            last = last.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
        size--;
    }

    public void printList(){
        Node currNode = head;
        if(currNode == null){
            System.out.println("Empty");
            return;
        }
        else{
            System.out.print("[");
            while(currNode != null){
                System.out.print(currNode.data + " ");
                currNode = currNode.next;
            }
            System.out.print("]\n");
        }
    }

    public void addAtPos(int d, int pos){
        Node newNode = new Node(d);
        if(pos<1) return;
        if((head == null  && pos == 1) || pos == 1){
            newNode.next = head;
            head = newNode;
            size++;
        }
        else{
            Node currNode = head;
            int i = 1;
            while(i<pos-1){
                currNode = currNode.next;
                i++;
            }
            newNode.next = currNode.next;
            currNode.next = newNode;
            size++;
        }
    }

    public void searchElement(LinkedLists l, int ele){
        Node newNode = l.head;
        if(newNode == null) return;
        int i = 0;
        while(newNode != null){
            
            if(newNode.data == ele){
                System.out.println("Element found at: "+i);
                return;
            }
            i++; 
            newNode = newNode.next; 
        }
        System.out.println("Element not found");
        
    }

    public int getSize(){
        return size;
    }
}

public class Que3 {
    public static void main(String[] args) {
        LinkedLists ll = new LinkedLists();
        ll.addFirst(99);
        ll.addFirst(88);         
        ll.addFirst(11);         
        ll.addFirst(22);    
        ll.printList();
        // ll.deleteFirst();     

        
        // ll.deleteLast();
        ll.printList();
        // System.out.println(ll.getSize());
        ll.searchElement(ll, 33);
    }
}
