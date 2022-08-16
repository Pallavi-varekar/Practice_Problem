import java.util.Scanner;

public class Prime_Range {
    public static void main(String[] args) {
        int n1,i,j;
        int n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value n1");
        n1 = sc.nextInt();
        System.out.println("enter value n2");
        n2=sc.nextInt();

        for(i=n1; i<=n2; i++)
        {
            for(j=2; j<=i; j++ )

            {
                if(i%j==0)
                    break;

            }
            if(i==j)

                System.out.println(j);

        }


    }
}