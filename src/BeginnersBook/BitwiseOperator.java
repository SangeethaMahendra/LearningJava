package BeginnersBook;

public class BitwiseOperator {
    public static void main(String[] args) {
        int num1 = 11;
        int num2 = 12;
        int result =0;

        result = num1 & num2;
        System.out.println("num1 & num2: "+result);  // Output num1 & num2: 8

        result = num1 | num2;
        System.out.println("num1 | num2: "+result);  //Output : num1 | num2: 15

        result = num1 ^ num2;
        System.out.println("num1 ^ num2: "+result); //Output : num1 ^ num2: 7

        result = ~num1;
        System.out.println("~num1: "+result); //Output : ~num1: -12

        result = num1 << 2;
        System.out.println("num1 << 2: "+result); result = num1 >> 2; // Output : num1 << 2: 44
        System.out.println("num1 >> 2: "+result); // Output : num1 << 2: 2

    }
}
