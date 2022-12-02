package Codes;
import java.util.Scanner;
public class pattern
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        
        int b = s.length();
        for(int i=0;i<b;i++)
        {
            System.out.println(s.charAt(i));
        }
    }
}