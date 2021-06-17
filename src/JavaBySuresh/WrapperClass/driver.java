package JavaBySuresh.WrapperClass;

//Wrapper class is converting Primitive data types into Objects or Vice Versa
public class driver {
    public static void main(String[] args) {
        int i1 = 25,i2 = 37;
        float i3 = 40, i4 = 60;
        double i5 = 80 , i6 = 20;

        // The below method is Manually Converting by dev Called boxing
        Integer obj1 = new Integer(i1);
        Integer obj2 = new Integer(i2);
        System.out.println("Manually Converting Integer " + (obj1+obj2));
        //The below method is converting automatically by JVM is called auto-boxing
        Integer obj3 = i1;
        Integer obj4 = i2;
        System.out.println("Auto Converting Integer " + (obj3+obj4));

        // float converting
        Float f1 = new Float(i3);
        Float f2 = new Float(i4);
        System.out.println("Manually Converting Float " + (f1+f2));
        Float f3 = new Float(i3);
        Float f4 = new Float(i4);
        System.out.println("Auto Converting Float " + (f3+f4));

        //Double Conerting
        // float converting
        Double d1 = new Double(i5);
        Double d2 = new Double(i6);
        System.out.println("Manually Converting Double " + (d1+d2));
        Double d3 = i5;
        Double d4 = i6;
        System.out.println("Auto Converting Double " + (d3+d4));









    }
}
