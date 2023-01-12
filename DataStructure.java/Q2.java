// Use the linked list data structure (either single or double as convenient) to represent a polynomial of the form P(x) = anxn + an-1xn-1 + ……………. + a1x1 + a0. Prepare a java class called Polynomial, to implement the linked structure polynomial representation. Include a method in the class that could perform a polynomial addition. Write a java application to perform polynomial addition using the created Polynomial class
import java.util.*;

class Polynomial{
    class Node{
        int coeff;
        int pow;
        Node next;
        Node(int coeff, int pow){
            this.coeff = coeff;
            this.pow = pow;
            this.next = null;
        }
    }
    Node head;
    Polynomial(){
        head = null;
    }

    Scanner sc = new Scanner(System.in);
    public void initPolynomial(int degree){
        int[] arrCoef = new int[degree];
        int[] arrPow = new int[degree];
        System.out.println("Enter the coefficients of the polynomial one by one: ");
        for(int i=0; i<arrCoef.length; i++){
            arrCoef[i] = sc.nextInt();
        }
        
        System.out.println("Enter the powers of variables one by one");
        for(int i=0; i<arrCoef.length; i++){
            arrPow[i] = sc.nextInt();
        }
        for(int i=0; i<arrCoef.length; i++){
            Node newNode = new Node(arrCoef[i], arrPow[i]);
            if(head == null) head = newNode;
            else{
                Node currNode = head;
                while(currNode.next != null){
                    currNode = currNode.next;
                }
                currNode.next = newNode;
            }
        }
    }

    private void pushToPoly(int coeff, int pow){
        Node newNode = new Node(coeff, pow);
        if(head == null) head = newNode;
        else{
            Node currNode = head;
            while(currNode.next != null){
                currNode = currNode.next;
            }
            currNode.next = newNode;
        }
    }

    public void addPoly(Polynomial poly){
        Node poly2 = poly.head;
        Node poly1 = head;
        Polynomial resultPoly = new Polynomial();
        while((poly1 != null) && (poly2 != null)){
            if(poly1.pow > poly2.pow){
                resultPoly.pushToPoly(poly1.coeff, poly1.pow);
                poly1 = poly1.next;
            }
            else if(poly2.pow > poly1.pow){
                resultPoly.pushToPoly(poly2.coeff, poly2.pow);
                poly2 = poly2.next;
            }
            else if(poly1.pow ==  poly2.pow){
                resultPoly.pushToPoly(poly1.coeff + poly2.coeff, poly1.pow);
                poly1 = poly1.next;
                poly2 = poly2.next;
            }
        }
        System.out.println("Resultant Polynomial");
        resultPoly.printPoly();
    }

    public void printPoly(){
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.coeff + "X" + "^" + currNode.pow);
            currNode = currNode.next;
            if(currNode != null) System.out.print(" + ");
        }
        System.out.println();
    }
    
}


public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Polynomial poly1 = new Polynomial();
        Polynomial poly2 = new Polynomial();
        System.out.println("1st Polynomial");
        System.out.println("Enter the degree of 1st polynolmial: ");
        int degree1 = sc.nextInt();
        poly1.initPolynomial(degree1);
        System.out.println("2nd Polynomial");
        System.out.println("Enter the degree of 2nd polynolmial: ");
        int degree2 = sc.nextInt();
        poly2.initPolynomial(degree2);
        poly1.printPoly();
        poly2.printPoly();
        poly1.addPoly(poly2);
        sc.close();
    }    
}
