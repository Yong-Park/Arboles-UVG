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

        //funcion del splaytree
        SplayTreeFunctrion SplayTree = new SplayTreeFunctrion();

    }
}