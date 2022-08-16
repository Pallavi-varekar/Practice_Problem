import java.util.Scanner;

public class Greatest_from_Three
{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value num1: ");
        int num1=sc.nextInt();
        System.out.println("enter value num2: ");
        int num2=sc.nextInt();
        System.out.println("enter value num3: ");
        int num3=sc.nextInt();
        //check num1 is greater
        if(num1>num2 && num1>num3)
        {
            System.out.println("greater num is: "+num1);
        }
        else if(num2>num1 && num2>num3)
        {
            System.out.println("greater num is: "+num2);
        }
        else if(num3>num1 && num3>num2)
        {
            System.out.println("greater num is: "+num3);
        }
}}
