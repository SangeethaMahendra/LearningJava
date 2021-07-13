package JavaBySuresh.Exception;

public class Emp1 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c = Class.forName("com.ls.Emp");
        System.out.println(c.getClass().getName());
    }

}
