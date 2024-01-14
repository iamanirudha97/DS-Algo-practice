public class CircularLL {
    private Node head;
    private Node tail;
    int size;

    public CircularLL(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void insert(int value){
        Node node = new Node(value);
        if(head == null){
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
        size++;
    }

    public void display(){
        Node node = head;
        if(head != null){
            do{
                System.out.print(node.value + "->");
                node = node.next;
            } while (node != head);
        }
        System.out.println(" HEAD");
    }

    public void delete(int value){
        Node node = head;
        if(node == null) return;
        if(node.value == value){
            head = head.next;
            tail.next = head;
        }

        do{
            Node n = node.next;
            if(n.value == value){
                node.next = n.next;
                break;
            } node = node.next;
        } while(node != head);
    }


    private class Node{
        int value;
        Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}
