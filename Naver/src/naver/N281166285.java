package naver;

import java.util.Scanner;
public class N281166285 {
    public static void main (String[] args)
    {
        Scanner read = new Scanner (System.in);
        char toss;
        System.out.println("Enter the toss outcome:");
        toss = read.next().charAt(0);
        //accepting the input as string and take the first letter
        //by using character at index0
        if (toss=='H'||toss=='h')
        {
            System.out.println("Heads is the outcomes");
        }
        else if (toss=='T'||toss=='t')
        {
            System.out.println("Tails is the outcome");
        }
        else
        {
            System.out.println("Invalid outcome");
        }
    }
}
