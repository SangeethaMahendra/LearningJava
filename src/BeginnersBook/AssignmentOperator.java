package BeginnersBook;

public class AssignmentOperator {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        num2 = num1;
        System.out.println("= Output: " + num2);

        num2 += num1;
        System.out.println("= Output: " + num2); // num2+num1

        num2 -= num1;
        System.out.println("-= Output: " + num2); // num2-num1

        num2 *= num1;
        System.out.println("*= Output: " + num2); // num2*num1

        num2 /= num1;
        System.out.println("/= Output: " + num2); //num2/num1

        num2 %= num1;
        System.out.println("%= Output: " + num2); //num1%num1


    }
}
    //Output: 10
//        = Output: 20
//        -= Output: 10
//        *= Output: 100
//        /= Output: 10
//        %= Output: 0