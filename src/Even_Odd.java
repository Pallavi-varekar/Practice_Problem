import java.util.Scanner;

public class Even_Odd {
    public static void main(String[]args)
    {
        int n;
        System.out.println("enter any number");
        Scanner r = new Scanner(System.in);
        n=r.nextInt();
        if(n % 2 == 0)
        {
            System.out.println("entered number is Even");

        }
        else {
            System.out.println("entered number is Odd");
        }
    }
}
