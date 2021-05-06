package AssignmentsByNag;

public class PrintHalfPyramid {
    public static void main(String[] args) {
        //HALF PYRAMID PATTERN
        for(int i=1; i<=5; i++) //1<=5; yes; ,2<=5; yes
        {
            for(int j=1; j<=i; j++)// 2<=1 no; 2=2 yes; print *;
            {
                System.out.print("* ");
            }
            System.out.println("");

        }

        //INVERTED HALF PYRAMID *
        System.out.println("\n");
        for(int i=5; i>=1; i--) //1<=5; yes; ,2<=5; yes
        {
            for(int j=1; j<=i; j++)// 2<=1 no; 2=2 yes; print *;
            {
                System.out.print("* ");
            }
            System.out.println("");
        }

        /* System.out.println("\n");
        for(int i=1; i<=5; i++) //1<=5; yes; ,2<=5; yes
        {
            for(int j=5; j>=i; j--)// 2<=1 no; 2=2 yes; print *;
            {
                System.out.print("* ");
            }
            System.out.println("");
        }*/
    }
}
