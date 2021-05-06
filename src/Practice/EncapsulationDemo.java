package Practice;

 /*class EncapsuleClass1 {

    int a =10;
    private int b = 20;
    void display()
    {
        System.out.println(a + " " + b);

    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}*/


public class EncapsulationDemo {


    public static void main(String[] args) {
        EncapsuleClass1 encObj = new EncapsuleClass1();
        //encObj.getA();
        //encObj.getB();
        encObj.display();
        encObj.setA(200);
        encObj.setB(100);

        System.out.println(encObj.getA() + " "+ encObj.getB());

    }
}
