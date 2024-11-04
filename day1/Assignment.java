package day1;

public class Assignment {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        int result = a;
        System.out.println("Assignment: " + result);  

        result += b;
        System.out.println("Add and assign: " + result);  

        result -= a;
        System.out.println("Subtract and assign: " + result);  
        
        result *= a;
        System.out.println("Multiply and assign: " + result);  

        result /= a;
        System.out.println("Divide and assign: " + result); 

        result %= 3;
        System.out.println("Modulus and assign: " + result);  
    }
}


