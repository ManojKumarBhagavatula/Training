package day2_DSA;



public class CircularLinkedList {
    Node head;
    Node last;
    int size = 0;
    public void add(int data){
        size++;
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            head.next = head;
            last = head;
            return;
        }
        last.next = newNode;
        last = newNode;
        last.next = head;
    }
    public void addBegin(int data){
        size++;
        Node newNode = new Node(data);       
        if(head == null){
            head = newNode;
            head.next = head;
            last = head;
            return;
        }
        newNode.next = head;
        head = newNode;
        last.next = head;
        
    }
    public void add(int data, int position){
        size++;
        Node newNode = new Node(data);
        if(position <1 || position > size){
            System.out.println("Invalid Position");
        }
        else if(position == 1){
            addBegin(data);
        }
        else if(position == size){
            add(data);
        }
        else{
            Node temp = head;
            for(int i = 1; i<position -1; i++){
                temp = temp.next;
            }
            newNode.next= temp.next;
            temp.next = newNode;
        }

    }
    public void pop(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        size--;
        Node temp = head;
        while(temp.next.next!= head){
            temp = temp.next;
        }
        temp.next = head;
    }
    public void popBegin(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        last.next = head;
    }
    public void pop(int position){
        if(head == null){
            System.out.println("List is Empty.");
        }
        else if(position <1 || position > size){
            System.out.println("Invalid Position");
        }
        else if(position == 1){
            popBegin();
        }
        else if(position == size){
            pop();
        }
        else{
            Node temp = head;
            for(int i = 1; i<position -1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;

        }
    }
    public void search(int element){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        int position = 1;
        while(temp != null){
            if(temp.data == element){
                System.out.println("data found at position : "+position);
                return;
            }
            position++;
            temp = temp.next;
            if(temp == head){
                break;
            }
        }
    }
    public void displayElements(){
        if(size == 0){
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
            if(temp == head){
                break;
            }
        }
        System.out.println(head.data);
    }
    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.add(1);
        cll.add(2);
        cll.add(3);
        cll.addBegin(0);
        cll.popBegin();
        cll.add(5, 3);
        cll.displayElements();
        cll.pop(3);
        cll.displayElements();
        cll.search(3);
    }
}
