package JavaBySuresh.stringliterals;

public class StringMethodsDemo1 {

    //getclass() - it returns fully qualified class name for eg: com. java.lang.String
    void getClass1(){
            String s = "Sangeetha";
        System.out.println(s.getClass());
    }
       //getName() -
    void getClass2(){
        String s1 = "Sangeetha";
        System.out.println(s1.getClass().getName());
    }

    void Emp(){
        String s1 = "Sangeetha";
        System.out.println(s1.getClass());

    }

}

class demo{
    public static void main(String[] args) {
         StringMethodsDemo1 d = new StringMethodsDemo1();
         d.getClass1(); //output is class java.lang.String
        d.getClass2(); // output is java.lang.String

    }
}
