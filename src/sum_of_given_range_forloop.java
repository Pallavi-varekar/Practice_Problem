import java.util.Scanner;

public class sum_of_given_range_forloop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter starting vatlue: ");
        int a = sc.nextInt();
        System.out.println("enter ending value: ");
        int b = sc.nextInt();
        int sum = 0;

            for (int i =a; i<=b; i++)
            {
                sum = sum + i;
            }
            System.out.print(sum);

    }
}