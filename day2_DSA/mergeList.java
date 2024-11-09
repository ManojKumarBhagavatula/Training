package day2_DSA;

public class mergeList {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.insert(5);
        l1.insert(4);
        l1.insert(3);
        l1.insert(2);
        l1.insert(1);
        LinkedList l2 = new LinkedList();
        l2.insert(8);
        l2.insert(7);
        l2.insert(6);
        l2.insert(5);
        Node temp = l1.head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = l2.head;
        temp = l1.head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null" + "\nAfter sorting...");

        temp = l1.head;

        while(temp != null) {

            Node minNode = temp;
            Node temp2  = temp.next;    

            while(temp2 != null) {
                if(temp2.data < minNode.data){
                    minNode = temp2;
                }
                temp2 = temp2.next;
             }

             int tempData = temp.data;
             temp.data = minNode.data;
             minNode.data = tempData;

             temp = temp.next;
        }

        temp = l1.head;
        while(temp!= null){
            
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
