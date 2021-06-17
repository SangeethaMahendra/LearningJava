package JavaBySuresh.stringliterals;

public class hashcodeDemo {

   // public hashcodeDemo(String string) { //default constructor
    //}
     // Creating a constructor with instance variable. "techie" in the constructor will be called stored in the name variable
    String name;
    int id; // eg to print int value with toString method
    public hashcodeDemo(String name, int i) { //Parameterized constructor
        this.name = name;
        this.id = i;
    }
        // whenever the object is created it will call Object class toString method, since we override the toString method it will call overrided(child) method
    @Override
    public String toString() {
        //return "ABCD1234";
       // return name;  // "techie" in the constructor will be called stored in the name variable
        return " "+ this.id; // to print int value with toString method use concatenation. output 103
    }

    // Hashcode differentiate the memory location that the same value stored in different variable
    public static void main(String[] args) {
        String s1 = "VJ";
        System.out.println("Hashcode for s1 is = " +s1.hashCode() );

        //S2 is pointing to VJ too
        String s2 = "VJ";
        System.out.println("Hashcode for s2 is = " +s2.hashCode() );

         // if we change the value of the s1 the hashcode show the new memory location
        s1 = "Tech";
        System.out.println(s1.hashCode()); //output 2602678

        //Constructor
       // hashcodeDemo n = new hashcodeDemo("Techie" ); // default constructor will be created
        hashcodeDemo n = new hashcodeDemo("Techie" ,103); // constructor with String and int value
        String n1 = new String("gobi");
        System.out.println(n);  // output JavaBySuresh.stringliterals.hashcodeDemo@682a0b20 - (@682a0b20- hexadecimal value)
        System.out.println(n1);

    }
}
