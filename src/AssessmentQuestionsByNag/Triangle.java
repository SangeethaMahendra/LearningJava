package AssessmentQuestionsByNag;

public class Triangle {
    int a;
    int b;
    int c;

    public double area(){
        double p = (a+b+c)/2;
        return Math.pow(p*(p-a) * (p-b) * (p-c),.5);
    }

    public double perimeter(){
        return (a+b+c)/2;
    }

}

class Driver1{

    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.a = 3;
        t.b = 4;
        t.c = 5;
        System.out.println("Area of a triangle >>> " + t.area());
        System.out.println("Perimeter of a triangle >>> " + t.perimeter());
    }
}
