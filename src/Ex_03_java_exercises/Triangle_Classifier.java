package Ex_03_java_exercises;

import java.util.Scanner;

public class Triangle_Classifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a =");
        int a = scanner.nextInt();
        System.out.println("enter b =");
        int b = scanner.nextInt();
        System.out.println("enter c =");
        int c = scanner.nextInt();
        if (a == b && b == c){

            System.out.println("It is a equilateral triangle");

        } else if ((a == b || b == c || a == c )){
            System.out.println(" It is a isosceles triangle");
            
        } else
        {
            System.out.println("it is a scalene triangle");
        }
        scanner.close();
    }
}
