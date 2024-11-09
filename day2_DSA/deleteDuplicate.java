package day2_DSA;

public class deleteDuplicate {
    public static void main(String[] args){
        LinkedList l = new LinkedList();
        LinkedList l2 = new LinkedList();

        l.insert(1);
        l.insert(2);
        l.insert(3);
        l.insert(4);
        l.insert(1);
        l.insert(3);

        Node temp = l.head;

        while(temp != null){
            if(l2.search(temp.data) == false){
                l2.insert(temp.data);
            }
            temp = temp.next;
        }
        l2.displayElements();

    }
}
