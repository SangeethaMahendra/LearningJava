package AssignmentsByNag;

public class AddTwoNumbers {
    static int Add1 = 250;
    static int Add2 = 700;
    static int Add3 = Add1 + Add2;

    public static void main(String[] args) {
        int NUM1 = 100;
        int NUM2 = 200;
        int NUM3 = NUM1  + NUM2;
        System.out.println("Add two Numbers using local variable : NUM1 + NUM2 = " + NUM3);

        System.out.println("Add two numbers using instance variable : Add1 + Add2 = " + Add3);

    }
}
