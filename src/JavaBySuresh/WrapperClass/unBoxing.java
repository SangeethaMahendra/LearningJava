package JavaBySuresh.WrapperClass;

public class unBoxing {
    public static void main(String[] args) {
        demo d = new demo();
        d.intUnboxing();
    }


}

 class demo{
     Integer obj1 = 100;
     Integer obj2 = 400;
    // Manually converting Objects to primitive data types is called Unboxing
public void intUnboxing() {
    int i1 = obj1.intValue();
    int i2 = obj2.intValue();
    System.out.println(i1+i2);
    // Auto - converting Objects to primitive data types is called auto-Unboxing

    int i3 = obj1;
    int i4 = obj2;
    System.out.println(i3+i4);

}

}
