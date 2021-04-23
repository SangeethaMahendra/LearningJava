package AssignmentsByNag;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        // Natural number should be > 1
        // which has only 2 factors 1 and itself

      /* int num= 13;
        int count = 0;
        if(num>1)
        {
            for(int i=1;i<=num;i++)
            {
                if(num%i==0)
                    count++;
            }
            if (count == 2)
            {
                System.out.println(num + " is a Prime number");
            }
            else
            {
                System.out.println(num + "  is not a prime number");
            }
        }
        else
        {
            System.out.println(num + " is not a prime number");
        }*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check prime " );
        int num = sc.nextInt();
        int count =0;
        if (num > 1)
        {
            for(int i=1;i<=num; i++)
            {
                if(num%i==0)
                    count++;
            }
            if(count == 2)
            {
                System.out.println(num + " is a Prime number");
            }
            else
            {
                System.out.println(num + " is not Prime number");
            }

        }
        else
        {
            System.out.println(num +" is not a Prime number ");
        }
        sc.close();



       /*// Example
        for(int a=2;a<=15;a++)
        {
            if ((a == 2 || a == 3) || (a % 2 != 0 && a % 3 != 0)) {
                System.out.println(a + " is a prime number");
            }
        }*/
    }

}
