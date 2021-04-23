package AssignmentsByNag;

public class PrintHalfPyramid {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++) //1<=5; yes; ,2<=5; yes
        {
            for(int j=2; j<=i; j++)// 2<=1 no; 2=2 yes; print *;
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
