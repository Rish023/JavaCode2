package Codes;
import java.util.Scanner;
public class sum_2_2
{
    public static void main(String[]args)
    {
        int i,s=0,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        n = sc.nextInt();
        for(i=2;i<=n;i+=2)
        {
            if(i%4==0)
            s=s-i;
            else
            s=s+i;
        }
        System.out.println(s);
    }
}
