public class LinkedList {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;


    public void addFirst(int data){
        if(head==null){
            Node newNode = new Node(data);
            head = tail = newNode;
            return;
        }
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        if(head==null){
            Node newNode = new Node(data);
            head = tail = newNode;
            return;
        }
        Node newNode = new Node(data);
        tail.next = newNode;
        tail = newNode;
    }

    public static void print(){
        if(head==null) System.out.println("Empty");
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //do add in middle by yourself

    public void addInMiddle(int idx,int data){
        Node newNode = new Node(data);
        Node temp = head;
        for(int i=0;i<idx-1;i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public static void size(LinkedList ll) {
        Node temp = ll.head;
        int size=0;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        System.out.println(size);
    }

    public static void removeFirst(){
        head = head.next;
    }
    public static void removeLast(){
        Node temp = head;
        Node prev = head;
        while(temp.next.next!=null){
            prev = prev.next;
            temp = temp.next;
        }
        prev.next = null;
        tail = prev;
    }
    public static int findKey(int key,int count,Node temp){
        if(temp==null) return -1;                               //base case or terminating condition
        if (temp.data == key) return count;                     //condition(test case)
        return findKey(key, count + 1, temp.next);        //recursive call with updated parameters
    }

    public static void reverseLL(){
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        ll.head = new Node(1);
        ll.head.next = new Node(2);
        ll.tail = new Node(3);
        ll.head.next.next = tail;

        ll.print();
        ll.addFirst(13);
        ll.print();
        ll.addFirst(14);
        ll.print();
        ll.addFirst(15);
        ll.print();
        ll.addFirst(16);
        ll.print();
        ll.addLast(17);
        ll.print();
        ll.addInMiddle(5,4);
        ll.print();
        ll.addInMiddle(5,45);
        ll.print();
        size(ll);
        ll.removeFirst();
        ll.print();
        ll.removeLast();
        ll.print();
        System.out.println(ll.findKey(4,0,head));
        ll.reverseLL();
        ll.print();


    }
}
