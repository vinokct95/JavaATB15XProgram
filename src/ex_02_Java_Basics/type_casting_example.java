package ex_02_Java_Basics;

public class type_casting_example {
    public static void main(String[] args) {
        int tamil = 89 ;
        int english = 99;
        int math = 59;

        int total = tamil + english + math ;

        double average = total / 3 ;
        double avg = (double) total/3 ;
        long avg2 = (int)avg ;
        // explict type casting - widening + converting int -> double

        System.out.println("total = "+total);
        System.out.println("average = "+average);
        System.out.println("casting = "+avg);
        System.out.println("int = "+avg2);
    }
}
