import java.util.Scanner;

public class Greatest_Two_Num {
    public static void main (String []args){

        Scanner sc = new Scanner(System.in);

        System.out.println("enter number a: ");
        int a=sc.nextInt();
        System.out.println("enter nember b: ");
        int b=sc.nextInt();
       if(a>b)
        {
            System.out.println("number a is greater");
        }
        else {
        System.out.print("number b is greater");
        }
}}
