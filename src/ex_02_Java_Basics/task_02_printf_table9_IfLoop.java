package ex_02_Java_Basics;

public class task_02_printf_table9_IfLoop {
    public static void main() {
        int num = 9;
        //int i;
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%dx%d=%d\n", num, i, num * i);
        }
    }
}
