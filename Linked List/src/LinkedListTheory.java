public class LinkedListTheory {
    private Node head;
    private Node tail;
    private int size;

    public LinkedListTheory(){
        this.size = 0;
    }

    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;

        if (tail == null){
           tail = head;
        } size++;
    }

    public void insertlast(int value){
        if (tail == null){
            insertFirst(value);
            return;
        }

        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int value, int position){
        if(position == 0){
            insertFirst(value);
            return;
        }
        if(position == size){
            insertlast(value);
            return;
        }

        if(position > size){
            insertlast(value);
            return;
        }

        Node temp = getNode(position);
        Node node = new Node(value, temp.next);
        temp.next = node;
        size++;
    }

    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        } size--;
        return val;
    }

    public int deleteLast(){
        if(size <= 1) return deleteFirst();
        Node secondLast = getNode(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        return val;
    }

    public int delete(int position){
        if(position == 0){
            return deleteFirst();
        }

        if (position >= size - 1){
            return deleteLast();
        }

        Node prev = getNode(position - 1);
        prev.next = prev.next.next;
        int val = prev.next.value;
        return val;
    }

    public Node findNode(int value){
        Node node = head;
        while(node != null){
            if(node.value == value){
                return node;
            } node = node.next;
        } return null;
    }

    public Node getNode(int index){
        Node node = head;
        for(int i = 0; i < index; i++){
            node = node.next;
        }
        return node;
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}