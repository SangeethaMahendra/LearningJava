package BeginnersBook;

public class InstanceVarExample {
    String myInstanceVar="instance variable";
    public static void main(String[] args) {
        InstanceVarExample obj = new InstanceVarExample();
        InstanceVarExample obj2 = new InstanceVarExample();
        InstanceVarExample obj3 = new InstanceVarExample();

        //All three will display "Instance variable"
        System.out.println(obj.myInstanceVar);
        System.out.println(obj2.myInstanceVar);
        System.out.println(obj3.myInstanceVar);

        //changing the value variable using obj2
        obj2.myInstanceVar = "Changed Text";

        // only the obj2 value got changed, others remain unchanged
        System.out.println(obj.myInstanceVar);
        System.out.println(obj2.myInstanceVar);
        System.out.println(obj3.myInstanceVar);

    }
}
/* output :
instance variable
instance variable
instance variable
instance variable
Changed Text
instance variable
 */
