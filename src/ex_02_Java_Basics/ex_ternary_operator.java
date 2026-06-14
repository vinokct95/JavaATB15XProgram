package ex_02_Java_Basics;

import java.sql.SQLOutput;

public class ex_ternary_operator {
  public static void main(String[] args) {
      int marks = 79;
     // String result =  (marks >=40) ? "Pass" : "Fail" ;
      String result = marks >= 40 ? (marks >= 80 ? "Pass with distinsion" : "Pass") : " Fail ";
      System.out.println("Result = "+result );

    }
}
