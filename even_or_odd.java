import java.util.Scanner;

public class even_or_odd {
    // chect the number
    public static  void even_or_odd(int a){
        if (a%2 == 0){
            System.out.println("The number is EVEN");
        }
        else{
            System.out.println("The number is ODD");
        }
    }
     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         int a =sc.nextInt();
         even_or_odd(a);
    }
}
