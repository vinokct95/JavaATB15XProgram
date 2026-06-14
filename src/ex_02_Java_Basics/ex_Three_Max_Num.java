package ex_02_Java_Basics;

public class ex_Three_Max_Num {
    public static void main(String[] args) {
        // ternary operator example with out if condition

         int A = 10 ;
         int B = 30 ;
         int C = 40;
         int Max = (A > B) ? (A > C ? A : C ) : (B > C ? B : C );
         System.out.println(Max);

    }
}
