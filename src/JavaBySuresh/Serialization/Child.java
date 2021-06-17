package JavaBySuresh.Serialization;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Child extends Parent {

    public static void main(String[] args) throws IOException,ClassNotFoundException
    {
         Parent p = new Parent(10, "Sowjanya","Dev");
        FileOutputStream fos = new FileOutputStream("E://Parents");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(p);
        System.out.println("serialization completed");


    }
}
