package ex_02_Java_Basics;

public class ex_unary_operator_increment_task {
    public static void main() {
        int a = 10;
        a = a++ + a++ + a++;
        System.out.println(a);

        int b = 3;

        int c = b++ * ++b;

        System.out.println(c);


        int d = 5;

        System.out.println(d++ + d--);


    }
}
