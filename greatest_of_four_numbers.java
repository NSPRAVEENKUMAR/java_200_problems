import java.util.*;
public class greatest_of_four_numbers {
public static  void greatest_of_four_numbers(int a,int b,int c,int d){
     if(a>b && a>c && a>d){
         System.out.println("The Greatest number is A");
     }
     else if (b>a && b>c && b>d) {
         System.out.println("The Greatest number is B");
     }
     else if (c>a && c>b && c>d) {
         System.out.println("The Greatest number is C");
     }
     else {
         System.out.println("The Greatest number is D");
     }
    }
    public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Value of A");
    int a= sc.nextInt();
    System.out.println("Enter the Value of B");
    int b= sc.nextInt();
    System.out.println("Enter the Value of C");
    int c= sc.nextInt();
    System.out.println("Enter the Value of D");
    int d= sc.nextInt();
    greatest_of_four_numbers(a,b,c,d);
    }
}
