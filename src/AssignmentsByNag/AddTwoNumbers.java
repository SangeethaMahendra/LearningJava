package AssignmentsByNag;

public class AddTwoNumbers {
    //static variable
    static int Add1 = 250;
    static int Add2 = 500;
    static int Add3 = Add1 + Add2;

    //Instance Variable
    int number1 = 500;
    int number2 = 400;
    int number3 = number1+number2;

    public static void main(String[] args) {
        //Local Variable
        int NUM1 = 100;
        int NUM2 = 200;
        int NUM3 = NUM1  + NUM2;
        System.out.println("Add two Numbers using local variable : NUM1 + NUM2 = " + NUM3);

         //Static Variable inside Main methods
        System.out.println("Add two numbers using static variable : Add1 + Add2 = " + Add3);

        //Instance Variable inside Main methods
        AddTwoNumbers obj = new AddTwoNumbers();
        System.out.println("Add two numbers using instance variable : number1 + number2 " + obj.number3);

    }
}
