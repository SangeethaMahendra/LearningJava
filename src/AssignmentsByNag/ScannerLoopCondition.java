package AssignmentsByNag;

import java.util.Scanner;

public class ScannerLoopCondition {
    public static void main(String[] args) {
        int n =0;
        int even =0;
        int odd = 0;
        System.out.println("Enter a Number");
        Scanner sc = new Scanner(System.in);
        int Number = sc.nextInt();
        while (n >= 0) {
            if (Number > 0) {
                if (Number % 2 == 0) {
                    even++;
                    System.out.println("Even Number");
                }
                else
                    System.out.println("Odd Number");
                    odd++;

            }
            n--;
        }

        }

    }

