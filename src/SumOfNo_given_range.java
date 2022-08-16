import java.util.Scanner;

public class SumOfNo_given_range
{
    public static void main(String []args)
    {
        int sum=0;
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter a first number");
        int first=scanner.nextInt();
        System.out.println("enter a second number");
        int last=scanner.nextInt();

        while(first<=last)
        {
            sum=sum+first;
            first++;
        }
        System.out.println("sum: "+sum);

}}
