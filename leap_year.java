import java.util.Scanner;

public class leap_year {
    public static  void leap_year( int year){
        if(year % 4 ==0 && year != 0){
            System.out.println("The  given year is leep year");
        }
        else{
            System.out.println(" Given year is not a leep Year");
        }
    }
    public static void main(String []arg){
        Scanner sc=new Scanner(System.in);
        int year= sc.nextInt();
        leap_year(year);
    }
}
