class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BinarySearTree{

    public Node insert(Node root,int value){
        if(root == null){
            root = new Node(value);
            return root;
        }
        if(root.data > value){
            root.left = insert(root.left,value);
        }
        else{
            root.right = insert(root.right,value);
        }
        return root;
    }

    public void inOrder(Node root){
        if(root == null) return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public boolean searchKey(Node root, int key){
        if(root == null) return false;
        if(root.data > key){
            return searchKey(root.left, key);
        }
        else if(root.data == key) return true;
        else{
            return searchKey(root.right, key);
        }
    }
}


public class BinarySearchTree {
    public static void main(String[] args) {
        BinarySearTree tree = new BinarySearTree();
        Node root = null;
        int arr[] = {5,6,3,2,1,4};
        for(int i=0; i<arr.length; i++){
            root = tree.insert(root,arr[i]);
        }
        tree.inOrder(root);
        System.out.println();
        // System.out.println(tree.searchKey(root, 8));
    }
}
