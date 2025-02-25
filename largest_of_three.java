import java.util.Scanner;

public class largest_of_three {
    public  static void  largest_of_three( int a, int b, int c){
        if(a>b && a>c){
            System.out.println("The Largest element in A");
        }
        else if(b>a && b>c){
            System.out.println("The Largest element in B");
        }
        else {
            System.out.println("The Largest element in C");
        }
    }
    public static void main(String [] arg){
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the element in A");
        int a=sc.nextInt();
        System.out.println("Enter the element in B");
        int b=sc.nextInt();
        System.out.println("Enter the element in C");
        int c=sc.nextInt();
        largest_of_three(a,b,c);
    }
}
