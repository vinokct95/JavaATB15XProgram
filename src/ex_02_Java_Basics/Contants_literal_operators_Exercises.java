package ex_02_Java_Basics;

public class Contants_literal_operators_Exercises {
    public static void main(String[] args) {
        final float gst = 0.18f;
        double RATE = 1000;
        double total_price = RATE + (RATE * gst);
        System.out.println("A = " + total_price);
        System.out.printf("B = %.2f",total_price);

    }
}
