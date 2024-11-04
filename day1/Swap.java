package day1;
public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
