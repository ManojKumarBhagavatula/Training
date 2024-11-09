package day2_DSA;

public class PrintMiddle {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
     
        l.insert(10);
        l.insert(20);
        l.insert(30);
        l.insert(40);
        l.insert(50);

        Node temp = l.head;
        int midIndex = l.count / 2;

        
        for (int i = 0; i < midIndex; i++) {
            temp = temp.next;
        }

        
        System.out.println("Middle element: " + temp.data);
    }
}