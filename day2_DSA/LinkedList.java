package day2_DSA;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
    }
}

public class LinkedList {
    Node head;

    int count = 0;
    public void insert(int data){
        Node temp = head;
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;                       
        }else{
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;                       
        }
        count++;
    }
    public void insertBeginning(int data){
        Node temp = head;
        Node newNode = new Node(data);
        if(temp == null){
            head = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }count++;
    }

    public void insertMiddle(int data, int position) {
        Node curr = head;
        Node newNode = new Node(data);
    
        if (head == null) {            
            head = newNode;            
        } else {
            if (position > count || position < 1) {
                System.out.println("Can't insert there");
            } else if (position == count) {
                System.out.println("Position is equal to count");
                insert(data); 
            } else if (position == 1) {
                insertBeginning(data); 
            } else {
                int c = 1;
                while (c < position - 1) {
                    c++;
                    curr = curr.next;
                }
                newNode.next = curr.next;
                curr.next = newNode;
            }
        }
        count++;
    }
    

    public void pop(){
        count--;
        Node temp = head;
        if(temp == null){
            System.out.println("Nothing to delete");
        }
        else{
            while(temp.next.next != null){
                temp = temp.next;
            }
            temp.next = null;
        }
    }

    public void pop(int position) {
        if (head == null ||position > count || position < 1 ) {
            System.out.println("Nothing to delete");
            return;
        }else if (position == 1) {
            deleteBeginning(); 
        } else if (position == count) {
            pop();
        } else {
            Node curr = head;
            int c = 1;
            while (c < position - 1) {
                curr = curr.next;
                c++;
            }
            curr.next = curr.next.next;
        }
    
        count--;
    }
    
    public void deleteBeginning(){
        count--;
        if(head == null){
            System.out.println("Nothing to delete");
        }
        else{
            head = head.next;
        }
    }

    public void displayReverse(){
        Node prev=null;
        Node curr = head;
        Node further = head.next;
        while(further!=null){
            curr.next = prev;
            prev = curr;
            curr = further;
            further = further.next;    
        }
        curr.next = prev;
        head = curr;
        displayElements();
    }
    public void displayElements(){
        Node temp = head;
        if(head == null){
            System.out.println("Empty List :");
        }else{
            while(temp != null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public void sort() {
        Node temp = head;
    
        for (int i = 0; i < count - 1; i++) {
            Node minNode = temp;  
            Node temp2 = temp.next;
    
            while (temp2 != null) {
                if (temp2.data < minNode.data) {
                    minNode = temp2; 
                }
                temp2 = temp2.next;
            }
    
            int tempData = temp.data;
            temp.data = minNode.data;
            minNode.data = tempData;
    
            temp = temp.next;
        }
    }
    

    public void replace(int val1, int pos1, int val2, int pos2){
        Node temp = head;
        for(int i = 1; i<pos1; i++){
            temp = temp.next;
        }
        temp.data = val2;
        temp = head;
        for(int i = 1; i<pos2; i++){
            temp = temp.next;
        }
        temp.data = val1;
    }

    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.insert(50);
        list.insert(40);
        list.insert(30);
        list.insert(20);
        list.insert(10);
        list.displayElements();
        list.sort();
        list.displayElements();
        System.out.println(list.count);
        
    }
    
}
