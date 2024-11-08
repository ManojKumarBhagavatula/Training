package day2_DSA;

 

public class CircularDoubleList {
    Node head;
    Node last;
    int size = 0;
   
    public void add(int data) {
        size++;
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            last = newNode;
            head.next = head;
            head.prev = head;
            return;
        }
        last.next = newNode;
        newNode.prev = last;
        last = newNode;
        last.next = head;
        head.prev = last;
    }

    public void addBegin(int data) {
        size++;
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
            last = head;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        head.prev = last;
        last.next = head;
    }
    public void add(int data, int position){
        if(position < 1 || position > size){
            System.out.println("Invalid position");
            return;
        }
        
        Node newNode = new Node(data);
        if(position == size){
            add(data);
            return;
        }
        if(position == 1){
            addBegin(data);
            return;
        }
        Node temp = head;
        for(int i = 1; i<position-1; i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next.prev = newNode;
        temp.next = newNode;
        newNode.prev = temp;
        size++;
    }

    public void pop(){
        if(head == null){
            System.out.println("Nothing to pop!!");
            return;
        }
        last = last.prev;
        last.next = head;
        head.prev = last;
        size--;
    }
    public void popBegin(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        last.next = head;
        head.prev = last;
        size--;
    }
    public void pop(int position){
        if(position < 1 || position > size){
            System.out.println("Invalid position");
            return;
        }
        else if(position == 1){
            popBegin();
            return;
        }
        else if(position == size){
            pop();
            return;
        }
        Node temp = head;
        for(int i = 1; i<position; i++){
            temp = temp.next;
        }
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
        size--;
    }

    public void displayElements() {
        if (head == null) {
            System.out.println("Empty list");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println(head.data);
    }

    public static void main(String[] args) {
        CircularDoubleList cdl = new CircularDoubleList();
        cdl.add(1);
        cdl.add(2);
        cdl.add(3);
        cdl.displayElements();
        cdl.addBegin(0);
        cdl.displayElements();
        cdl.pop();
        cdl.displayElements();
        cdl.popBegin();
        cdl.displayElements();
        cdl.add(10,2);
        cdl.displayElements();
        cdl.pop(3);
        cdl.displayElements();
      
    }
}
