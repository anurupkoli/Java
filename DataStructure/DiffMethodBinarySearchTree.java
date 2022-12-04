class BinarySearchTrees{
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

    Node root;
    BinarySearchTrees(){
        this.root = null;
    }

    public  Node insertRec(Node root, int key){
        if(root == null){
            root = new Node(key);
            return root;
        }
        if(root.data > key){
            root.left = insertRec(root.left, key);
        }
        else if(root.data < key){
            root.right = insertRec(root.right, key);
        }

        return root;
    }

    public void insert(int key){
        root = insertRec(root, key);
    }

    public void inOrderRec(Node root){
        if(root == null) return;
        inOrderRec(root.left);
        System.out.print(root.data + " ");
        inOrderRec(root.right);
    }

    public void inOrder(){
        inOrderRec(root);
    }

    private void postOrderRec(Node root){
        if(root == null) return;
        inOrderRec(root.left);
        inOrderRec(root.right);
        System.out.print(root.data + " ");
    }
    public void postOrder(){
        postOrderRec(root);
    }
}


public class DiffMethodBinarySearchTree {
    public static void main(String[] args) {
        BinarySearchTrees tree = new BinarySearchTrees();
        int arr[] = {1,3,4,5,6,8};
        for(int i=0; i<arr.length; i++){
            tree.insert(arr[i]);
        }
        tree.inOrder();
        System.out.println();
        tree.postOrder();
    }
}
