package day1;

public class Ranges {
    public static void main(String[] args) {
        System.out.println("Size of byte: " + Byte.SIZE/8 + " bytes, Min Value: " + Byte.MIN_VALUE + ", Max Value: " + Byte.MAX_VALUE);
        System.out.println("Size of short: " + Short.SIZE/8 + " bytes, Min Value: " + Short.MIN_VALUE + ", Max Value: " + Short.MAX_VALUE);
        System.out.println("Size of int: " + Integer.SIZE/8 + " bytes, Min Value: " + Integer.MIN_VALUE + ", Max Value: " + Integer.MAX_VALUE);
        System.out.println("Size of long: " + Long.SIZE/8 + " bytes, Min Value: " + Long.MIN_VALUE + ", Max Value: " + Long.MAX_VALUE);
        System.out.println("Size of float: " + Float.SIZE/8 + " bytes, Min Value: " + Float.MIN_VALUE + ", Max Value: " + Float.MAX_VALUE);
        System.out.println("Size of double: " + Double.SIZE/8 + " bytes, Min Value: " + Double.MIN_VALUE + ", Max Value: " + Double.MAX_VALUE);
        System.out.println("Size of char: " + Character.SIZE/8 + " bytes, Min Value: " + (int) Character.MIN_VALUE + ", Max Value: " + (int) Character.MAX_VALUE);
        System.out.println("Size of boolean: " + 1 + " bit (not explicitly defined in Java)");
    }
}
