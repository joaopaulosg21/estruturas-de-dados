package trees.binarysearchtree;

public class BinarySearchTree {
    private Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    private void insertNode(Node node, Integer key) {

        if (key < node.getKey()) {
            if (node.getLeft() == null) {
                node.setLeft(new Node(key));
            } else {
                insertNode(node.getLeft(), key);
            }
        } else {
            if (node.getRight() == null) {
                node.setRight(new Node(key));
            } else {
                insertNode(node.getRight(), key);
            }
        }
    }

    public void insert(Integer key) {

        if (root == null) {
            this.root = new Node(key);
        } else {
            this.insertNode(root, key);
        }

    }

    public void inOrderTraverse() {
        this.inOrderTraverse(root);
    }

    private void inOrderTraverse(Node node) {
        if (node != null) {
            this.inOrderTraverse(node.getLeft());
            System.out.print(node.getKey() + ",");
            this.inOrderTraverse(node.getRight());
        }
    }

    public void preOrderTraverse() {
        this.preOrderTraverse(root);
    }

    private void preOrderTraverse(Node node) {
        if (node != null) {
            System.out.print(node.getKey() + ",");
            this.preOrderTraverse(node.getLeft());
            this.preOrderTraverse(node.getRight());
        }
    }

    public void postOrderTraverse() {
        this.postOrderTraverse(root);
    }

    private void postOrderTraverse(Node node) {

        if (node != null) {
            this.postOrderTraverse(node.getLeft());
            this.postOrderTraverse(node.getRight());
            System.out.print(node.getKey() + ",");
        }
    }

    public Node reverse(Node node) {
        if (node == null) {
            return node;
        }

        Node left = reverse(node.getLeft());
        Node right = reverse(node.getRight());

        node.setLeft(right);
        node.setRight(left);

        return node;
    }

    public void reverse() {
        root = reverse(root);
    }

    @Override
    public String toString() {
        return "BinarySearchTree [root=" + root + "]";
    }
}
