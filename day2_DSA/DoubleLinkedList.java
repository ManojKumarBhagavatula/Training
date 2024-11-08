package day2_DSA;


public class DoubleLinkedList {
    Node head;
    Node last = head;
    int size;
    boolean flip = false;
    public void add(int data){
        size++;
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            last = newNode;
        }
        else{
           last.next = newNode;
           newNode.prev = last;
           last = newNode;
        }
    }
    public void add(int position, int data){
        Node newNode = new Node(data);
        if(position < 1 || position > size){
            System.out.println("Enter correct position");
            return;
        }
        
        else if(position == size)add(data);
        else if(position == 0)addBegin(data);
        else{
            Node temp = head;
            for(int i = 1; i<position-1; i++){
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next.prev = newNode;
            temp.next = newNode;
            newNode.prev = temp;
        }
        size++;

    }
    public void addBegin(int data){
        size++;
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }
    public void pop(){
        if(head == null){
            System.out.println("Nothing to pop !!");
            return;
        }        
        size++;
        last = last.prev;
        last.next = null;
        
    }
   
    public void popBegin(){
        if(head == null){
            System.out.println("Nothing to pop!!");
            return;
        }
        head = head.next;
        head.prev = null;
        size--;

    }
    public void pop(int position){
        if(position < 1 || position > size){
            System.out.println("Enter correct position");
            return;
        }
        
        else if(position == size)pop();
        else if(position == 0)popBegin();
        else{
            Node temp = head;
            for(int i = 1; i<position; i++){
                temp = temp.next;
            }
            temp.next.prev = temp.prev;
            temp.prev.next = temp.next;
        }
        size--;

    }
    public void reverse(){
        if(head == null){
            System.out.println("no elements to reverse");
            return;
        }
        Node temp;
        temp = head;
        head = last;
        last = temp;
        flip = true;
    }
    public int search(int node) {
        Node temp = head;
        int position = 1; // to keep track of the position
        while (temp != null) {
            if (temp.data == node) {
                System.out.println("found at position: " + position);
                return position;
            }
            temp = temp.next;
            position++;
        }
        System.out.println("Node not found");
        return -1;
    }
    
    public void displayElements(){
        Node temp = head;
        if(flip == true){
            while(temp!=null){
                System.out.print(temp.data+" -> ");
                temp=temp.prev;
            }
            System.out.println("null");
            flip = false;
        }
        else{
            while(temp!=null){
                System.out.print(temp.data+" -> ");
                temp=temp.next;
            }
            System.out.println("null");
        }
    }
    public static void main(String[] args) {
        DoubleLinkedList dl = new DoubleLinkedList();
        dl.add(1);
        dl.add(2);
        dl.add(3);
        dl.add(4);
        dl.displayElements();
        dl.pop(3);
        dl.displayElements();
        dl.search(4);
    }
}
