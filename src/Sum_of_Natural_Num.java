import java.util.Scanner;

public class Sum_of_Natural_Num {
    public static void main(String[]args){
    int n;
    int sum=0;
    System.out.println("enter one number");
    Scanner r = new Scanner(System.in);
    n=r.nextInt();
    for (int i=1; i<=n; i++) {

        sum = sum + i;
    }
        System.out.println(sum);



}}
