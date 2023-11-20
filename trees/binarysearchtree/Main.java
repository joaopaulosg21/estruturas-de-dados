package trees.binarysearchtree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(10);
        tree.insert(9);
        tree.insert(11);

        System.out.print("Em ordem -> ");
        tree.inOrderTraverse();
        System.out.println();

        System.out.print("Pre ordem -> ");
        tree.preOrderTraverse();
        System.out.println();

        System.out.print("Pos ordem -> ");
        tree.postOrderTraverse();
    }
}
