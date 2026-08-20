package operator;

public class Demo6 {
    public static void main(String[] args) {
        int a = 0b10011100;
        int b = 0b11010010;

        System.out.println("a&b = " + Integer.toBinaryString(a & b));//10010000
        System.out.println("a|b = " + Integer.toBinaryString(a | b));//11011110
        System.out.println("a^b = " + Integer.toBinaryString(a ^ b));//01001110
        System.out.println("~a  = " + Integer.toBinaryString(~a));//01100011
        }
}
