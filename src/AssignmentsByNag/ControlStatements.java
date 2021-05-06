package AssignmentsByNag;

public class ControlStatements {
    public static void main(String[] args) {
     // Simple if condition
        int Studentmark = 110;
        if (Studentmark >= 100)
        {
            System.out.println("Outstanding performance");
        }

        // IF ELSE CONDITION
        //Check if the number is divisible by 2 or not
        //int mark = 13;
        int mark = 150;
        if (mark % 2 == 0)
        {
            System.out.println("Even Number");
        }
        else
            {
                System.out.println("Odd Number");
            }
        //IF ELSE CHECK MULTIPLE CONDITION USING OPERATORS
        //  Leap year Example
        //  A year is leap, if divisible by 4 and 400. but, not by 100
        int leapYear = 1998;
        if((leapYear % 4 == 0 && leapYear % 100 != 0) || leapYear % 400 == 0)
       // if(leapYear % 4 == 0 && leapYear % 400 == 0|| leapYear % 100 != 0)
        {
            System.out.println("LEAP YEAR");
        }
        else
        {
            System.out.println("COMMON YEAR");
        }

    }
}
