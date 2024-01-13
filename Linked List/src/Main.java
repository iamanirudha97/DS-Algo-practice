public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertFirst(3);
        dll.insertFirst(5);
//        dll.display();
        dll.insertLast(6);
        dll.insert(0,1);
        System.out.println(dll.delete(3));
        dll.display();
    }
}
