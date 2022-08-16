import java.util.Scanner;

public class scanner_negative_positive {
    public static void main(String[]args)
    {
        int n;
        System.out.println("enter any number");
        Scanner r = new Scanner(System.in);
        n=r.nextInt();
        if(n>0)
        {
            System.out.println("entered numer is positive");
        }
        if(n<0)
        {
            System.out.println("entered number is negative");
        }
        else{
            System.out.println("entered number neither positive nor negative");
        }
    }

}
