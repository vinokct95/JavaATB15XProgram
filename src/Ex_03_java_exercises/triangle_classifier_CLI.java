package Ex_03_java_exercises;

public class triangle_classifier_CLI {
    public static void main(String[] args) {
        String side1 = args [0];
        String side2 = args [1];
        String side3 = args [2];
        int a = Integer.parseInt(side1);
        int b = Integer.parseInt(side2);
        int c = Integer.parseInt(side3);

        if (a == b && b == c){

            System.out.println("It is a equilateral triangle");

        } else if ((a == b || b == c || a == c )){
            System.out.println(" It is a isosceles triangle");

        } else
        {
            System.out.println("it is a scalene triangle");
        }
    }
}
