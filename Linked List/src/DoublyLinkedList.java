public class DoublyLinkedList {

    private Node head;
    private int size;

    public DoublyLinkedList(){
        this.size = 0;
    }

    public void display(){
       Node node = head;
       Node last = null;
       while(node != null){
           last = node;
           System.out.print(node.value + "->");
           node = node.next;
       }
        System.out.println("END");

        System.out.println("Printing in reverse");
       while(last != null){
           System.out.print(last.value + "->");
           last = last.prev;
       }
        System.out.println("START");
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;
        size++;
    }

    public void insertLast(int value){
        Node node = new Node(value);
        Node last = head;
        node.next = null;

        if(head == null){
            node.prev = null;
            head = node;
            return;
        }
        while(last.next != null){
            last = last.next;
        }
        last.next = node;
        node.prev = last;
        size++;
    }

    public void insert(int value, int position){
        if(position == 0){
            insertFirst(value);
            return;
        }

        if(position >= size){
            insertLast(value);
            return;
        }

        Node prev = getNode(position - 1);
        Node node = new Node(value);
        node.next = prev.next;
        prev.next = node;
        node.prev = prev;

        if(node.next != null){
            node.next.prev = node;
        }
        size++;
    }

    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        size--;
        return size;
    }

    public int deleteLast(){
        if(size <= 1){
            return deleteFirst();
        }
        Node secondLast = getNode(size - 2);
        int val = secondLast.next.value;
        secondLast.next = null;
        return val;
    }

    public int delete(int position){
        if(position >= size - 1) return deleteLast();
        if(position == 0) return deleteFirst();

        Node p = getNode(position - 1);
        Node n = getNode(position + 1);
        int val = n.prev.value;
        n.prev = n.prev.prev;
        p.next = p.next.next;
        return val;
    }

    public Node getNode(int index){
        Node node = head;
        for(int i = 0; i < index; i++){
            node = node.next;
        }
        return node;
    }

    private class Node{
     private int value;
     private Node next;
     private Node prev;

     public Node(int value){
         this.value = value;
     }

     public Node(int value, Node next, Node prev){
        this.value = value;
        this.next = next;
        this.prev = prev;
     }
    }
}
