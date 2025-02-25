import java.util.Scanner;

public class divisible_by_3_and_5 {
    public static void divisible_by_3_and_5(int a){
        if(a%3 == 0  && a%5 == 0){
            System.out.println("the number is Sucessfully divided by 3 and 5");
        }
        else{
            System.out.println("The number is not divided by  3 and 5");
        }
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        divisible_by_3_and_5(a);
        }
    }

