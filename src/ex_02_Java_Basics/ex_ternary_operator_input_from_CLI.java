package ex_02_Java_Basics;
public class ex_ternary_operator_input_from_CLI {
    public static void main(String[] args) {
        String A = args[0];
        String B = args[1];
        String C = args [2];
        int a = Integer.parseInt(A);
        int b = Integer.parseInt(B);
        int c = Integer.parseInt(C);
        int max = (a > b) ? (a > c ? a :c) : (b > c) ? b : c;
        System.out.println("A = "+a);
        System.out.println("B = "+b);
        System.out.println("c = "+c);
        System.out.println("MAx = "+max);

    }
}
