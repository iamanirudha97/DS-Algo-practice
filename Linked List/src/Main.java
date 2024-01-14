public class Main {
    public static void main(String[] args) {
//        DoublyLinkedList dll = new DoublyLinkedList();
//        dll.insertFirst(3);
//        dll.insertFirst(5);
////        dll.display();
//        dll.insertLast(6);
//        dll.insert(0,1);
//        System.out.println(dll.delete(3));
//        dll.display();

        CircularLL cll = new CircularLL();
        cll.insert(1);
        cll.insert(2);
        cll.insert(3);
        cll.insert(4);
        cll.display();
        cll.delete(3);
        cll.display();
    }
}
