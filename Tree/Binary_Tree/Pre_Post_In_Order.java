public class Pre_Post_In_Order {
        static class Node{
                int data;
                Node left;
                Node right;
        
                Node(int data){
                    this.data = data;
                    this.left = null;
                    this.right = null;
                }
            }
            static class BinaryTree {
                static int idx = -1;
                public Node buildTree( int nodes[]){
                    idx++;
                    if(nodes[idx] == -1){
                        return null;
                    }
        
                    Node newNode = new Node(nodes[idx]);
                    newNode.left = buildTree(nodes);
                    newNode.right = buildTree(nodes);
                    return newNode;
                }
            }

            public static void preorder(Node root){
                if (root == null){
                        return;
                }
                System.out.println(root.data+" ");
                preorder(root.left);
                preorder(root.right);
                // System.out.println(root.left);
                // System.out.println(root.right);
            }
        
            public static void main(String[] args) {
                int nodes[] = {10,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
                BinaryTree tree = new BinaryTree();
                Node root = tree.buildTree(nodes);
                preorder(root); 
                // System.out.println(root.left);
                // System.out.println(root.right);
            }
        }  

