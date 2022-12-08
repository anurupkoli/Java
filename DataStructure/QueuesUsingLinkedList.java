import java.util.Scanner;

class QueuedLinkedList{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next =  null;
        }
    }
    public Node head;

        public void addToQueue(int data){
            Node cuNode = new Node(data);
            if(head == null){head = cuNode;}
            else{
                cuNode.next =  head;
                head = cuNode;
            }
        }
        
        public void displayQueue(){
            Node cuNode = head;
            System.out.print("[");
            while(cuNode != null){
                System.out.print(cuNode.data+" ");
                cuNode = cuNode.next;
            }
            System.out.println("]");
        }

        public void delFromQueu(){
            if(head == null){return;}
            else{
                System.out.println(head.data+" removed");
                head = head.next;
            }
        }

        public void searchInQueue(int data){
            Node cuNode = head;
            while(cuNode != null){
                if(cuNode.data == data){
                    System.out.println(data + " found....");
                    return;
                }
                cuNode = cuNode.next;
            }
            System.out.println(data+" not found....");
        }

        public int queueSize(){
            int size = 0;
            Node currNode = head;
            while(currNode != null){
                currNode = currNode.next;
                size++;
            }
            return size;
        }

        public void isEmpty(){
            System.out.println(head == null);
        }
}



public class QueuesUsingLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueuedLinkedList lis = new QueuedLinkedList();
        System.out.println("Select from the following:");
        boolean flag = true;
        while(flag){
            System.out.println("1. Add to queue");
            System.out.println("2. Delete from queue");
            System.out.println("3. Search an element in queue");
            System.out.println("4. Display the queue");
            System.out.println("5. Check if queue is Empty");
            System.out.println("6. Get size of the queue");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();
            
            switch(ch){
                case 1: System.out.print("Enter the element: ");
                        int ele = sc.nextInt();
                        lis.addToQueue(ele);
                        break;
                case 2: lis.delFromQueu();
                        break;
                case 3: System.out.print("Enter the element you want to search for: ");
                        ele = sc.nextInt();
                        lis.searchInQueue(ele);
                        break;
                case 4: lis.displayQueue();
                        break;
                case 5: lis.isEmpty();
                        break;
                case 6: System.out.println("Size is: " + lis.queueSize());
                case 7: System.out.println("Thankyou for using this program");
                        flag = false;
                        break;
                default: System.out.println("Invalid choice!!");
            }
        }
        sc.close();
    }
    
}
