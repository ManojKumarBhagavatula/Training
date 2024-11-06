package day2_DSA;

class Node {
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}
public class Queue {
    Node front;
    Node rear;
    
    public void enqueue(int data) {
        Node newNode = new Node(data);
         if(front == null){
            front = newNode;
            rear = newNode;
         }
         else{
            rear.next = newNode;
            rear = newNode;
         }
    }
    public void dequeue(){
        if(front == null){
            System.out.println("Your queue is empty");
        }
        else{
            front = front.next;
        }
    }
    public void displayElements(){
        Node temp = front;
        if(temp == null){
            System.out.println("Queue is empty");
        }
        else{
            while(temp!=null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public void first(){
        if(front == null){
            System.out.println("Queue is empty");
        }
        else{
            System.out.println("First element is  : "+front.data);
        }
    }
    public void last(){
        if(rear == null){
            System.out.println("Queue is empty");
        }
        else{
            System.out.println("Last element is : "+rear.data);
        }
    }
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.displayElements();
        queue.dequeue();
        queue.displayElements();
        queue.first();
        queue.last();
    }
}
