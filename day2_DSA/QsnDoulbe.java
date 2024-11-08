package  day2_DSA;

import java.util.Scanner;

public class QsnDoulbe{
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            DoubleLinkedList list = new DoubleLinkedList();
            System.out.print("enter the size : ");
            int no = sc.nextInt();
            System.out.println();
            for(int i=0; i<no; i++){
                System.out.print("Enter element: ");
                list.add(sc.nextInt());
            }
            System.out.print("Enter element to remove: ");
            int remove = sc.nextInt();
            System.out.println();
            int pos = list.search(remove);
            if(pos != -1) {
                list.pop(pos);
                list.displayElements();
            }
            else{
                System.out.println("Element not found in the list.");
            }
        }
       
    }
}