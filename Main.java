public class Main{
    public static void main(String[] arg)
    {
        //funcion del heap
        System.out.println("Heap");
        HeapFunction Heap = new HeapFunction(15);
        Heap.insert(4);
        Heap.insert(5);
        Heap.insert(6);
        Heap.insert(12);
        Heap.insert(7);
        Heap.insert(15);
        Heap.insert(17);
        Heap.insert(2);
        Heap.insert(1);
        Heap.insert(9);
  
        Heap.print();
        System.out.println("The min heap is " + Heap.remove());
        System.out.println("");

        //funcion del splaytree
        System.out.println("Splay Tree");
        SplayTreeFunction SplayTree = new SplayTreeFunction();
        SplayTree.insert(17);
        SplayTree.insert(4);
        SplayTree.insert(6);
        SplayTree.insert(5);
        SplayTree.insert(15);
        SplayTree.insert(12);
        SplayTree.insert(7);
        SplayTree.insert(2);
        SplayTree.insert(1);
        SplayTree.insert(9);
        SplayTree.prettyPrint();

        //redblacktree
        System.out.println("RedBlackTree");
        RedBlackBST redblacktree = new RedBlackBST();
        redblacktree.insert(7);
        redblacktree.insert(5);
        redblacktree.insert(15);
        redblacktree.insert(4);
        redblacktree.insert(6);
        redblacktree.insert(12);
        redblacktree.insert(17);
        redblacktree.insert(2);
        redblacktree.insert(1);
        redblacktree.insert(9);
        redblacktree.prettyPrint();
    }
}