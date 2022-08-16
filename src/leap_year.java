import java.util.Scanner;

public class leap_year {
    public static void main(String [] args)
    {
        Scanner r = new Scanner(System.in);
        System.out.println("enter a year :");
        int year=r.nextInt();
        if((year % 400 == 0) || (year % 4 ==0 && year % 100 != 0))
        {
            System.out.println("enter year is leap year");

        }
        else
        {
            System.out.println("enter year is not a leap year");
        }
    }
}
