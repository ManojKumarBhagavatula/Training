package day2_DSA;


public class Stack {
    Node top;
    int count = 0;
    public void push(int data){
        count++;
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        
    }
         
    public void pop(){
        if(top == null){
            System.out.println("Nothing to pop");
            return;
        }
        top = top.next;
        count--;
    }
    public void displayElements(){
        Node temp = top;
        if(temp == null){
            System.out.println("Stack is empty");
        }
        else{
            while(temp!=null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }   
    }
    public void peek(){
        if(top == null){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Top element is: " + top.data);
        }
    }
    public static void main(String [] args){
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.displayElements();
        stack.pop();
        stack.displayElements();
        stack.peek();
    }
    
}
