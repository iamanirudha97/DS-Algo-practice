public class Main {
    public static void main(String[] args) {
        LinkedListTheory list = new LinkedListTheory();
        list.insertFirst(3);
        list.insertFirst(4);
        list.display();
        list.insertlast(5);
        list.display();
        list.deleteLast();
        list.insert(3,4);
        list.display();
        System.out.println(list.findNode(4));
    }
}
