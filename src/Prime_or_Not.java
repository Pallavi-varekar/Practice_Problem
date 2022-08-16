import java.util.Scanner;

public class Prime_or_Not {
    public static void main(String [] args)
    {
        int n,count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        n=sc.nextInt();
        for (int i=1; i<=n; i++)
        {
            if(n%i==0) {
                count++;
            }

                if(count==2){
                     System.out.println("enter number is prime");
                }//else {
                   // System.out.println("enter number is not prime");
                // }
        }
    }
}
