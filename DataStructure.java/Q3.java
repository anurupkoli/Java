// Make use of an array to implement a Stack and also use a linked structure to implement a queue. Prepare a java program that will read words from a user and add them to the queue. Now from the queue pick one word at a time and reverse each character of it using the stack and compare the original word and reversed word and report if the word is palindrome or not. Do the process for all the words in the queue.
import java.util.*;

class Stack{
    char[] arr;
    int i;
    int size;

    Stack(int size){
        this.arr = new char[size];
        this.i = 0;
        this.size = size;
    }

    public void push(char ch){
        arr[i] = ch;
        i++;
    }

    public char pop(){
        char ch = arr[i-1];
        i--;
        return ch;
    }

    public boolean isEmpty(){
        return i == 0;
    }
}

class Queue{
    class Node{
        String str;
        Node next;
        Node(String str){
            this.str = str;
            this.next = null;
        }
    }

    Node head;
    public int size;
    Queue(){
        size = 0;
        head = null;
    }

    public void push(String str){
        Node newNode = new Node(str);
        if(head == null) head = newNode;
        else{
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void printQueue(){
        Node currNode = head;
        System.out.print("[");
        while(currNode != null){
            System.out.print(currNode.str + ",");
            currNode = currNode.next;
        }
        System.out.println("]");
    }

    public void reportPalindWord(){
        Node currNode = head;
        while(currNode != null){
            String str = currNode.str;
            Stack st = new Stack(str.length());
            String reverseString = "";
            for(int i=0; i<str.length(); i++){
                st.push(str.charAt(i));
            }
            while(!st.isEmpty()){
                reverseString = reverseString + st.pop();
            }
            if(str.equals(reverseString)){
                System.out.println(str + " is a palindrome.");
            }
            currNode = currNode.next;
        }
    }
}

public class Q3 {
    public static void main(String[] args) {
        Queue li = new Queue();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag){
            System.out.println();
            System.out.println("1. Push to Queue");
            System.out.println("2. Print Queue");
            System.out.println("3. Search for Palindrome words");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();
            switch(ch){
                case 1: System.out.print("Enter the word: ");
                        String st = sc.next();
                        li.push(st);
                        break;
                case 2: li.printQueue();
                        break;
                case 3: li.reportPalindWord();
                        break;
                case 4: System.out.println("Thankyou!!");
                        flag = false;
                        break;
                default: System.out.println("Choose correct option!!");
                        break;
            }
        }
        sc.close();
    }    
}
