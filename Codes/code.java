package Codes;
import java.util.Scanner;
public class code
{
    public static void main(String[]args)
    {
        int a,b=0,n,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        n = sc.nextInt();
        for(i=1;i<=n;i++)
        {
            b=b+i;
        }
        System.out.println("The sum of the n numbers is "+b);
    }
}
