import java.util.*;

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

class BinaryTree{
    static int indx = -1;
    public Node buildTree(int values[]){
        indx++;
        if(values[indx] == -1){
            return null;
        }
        Node newNode = new Node(values[indx]);
        newNode.left = buildTree(values);
        newNode.right = buildTree(values);
        return newNode;
    }

    public void preOrder(Node root){
        if(root == null){
            // System.out.print(-1+" ");
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void inOrder(Node root){
        if(root == null){
            // System.out.print(-1+" ");
            return;
        }
        inOrder(root.left);
        // System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public void postOrder(Node root){
        if(root == null){
            // System.out.print(-1+" ");
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

    public void levelOrder(Node root){
        if(root == null) return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node cuNode = q.remove();
            if(cuNode == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.print(cuNode.data + " ");
                if(cuNode.left != null){
                    q.add(cuNode.left);
                }
                if(cuNode.right != null){
                    q.add(cuNode.right);
                }
            }
        }
    }

    public int countNodes(Node root){
        if(root == null){
            return 0;
        }
        int leftNodes = countNodes(root.left);
        int rightNodes = countNodes(root.right);
        return leftNodes+rightNodes+1;
    }

    public int sumOfNodes(Node root){
        if(root == null) return 0;
        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);
        return leftSum + rightSum + root.data;
    }

    public int height(Node root){
        if(root == null) return 0;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right); 
        int maxHeight = Math.max(leftHeight, rightHeight) + 1;
        return maxHeight;
    }
}

public class BinaryTrees {
    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        tree.preOrder(root);
        System.out.println();
        // tree.inOrder(root);
        // System.out.println();
        // tree.postOrder(root);
        // tree.levelOrder(root);
        System.out.println(tree.countNodes(root));
        System.out.println(tree.sumOfNodes(root));
        System.out.println(tree.height(root));

    }
}
