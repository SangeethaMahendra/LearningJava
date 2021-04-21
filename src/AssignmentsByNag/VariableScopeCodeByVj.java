public class VariableScopeCodeByVj {
    static String TEXT = "The End";

    public static void main(String[] args)
    {
        System.out.println("Hi");
        String s = "Hi";

        System.out.println(s);
        if (args != null) {
            String s2 = s;

            System.out.println(s2);
        }
        // System.out.println(s2);
        VariableScopeCodeByVj variables = new VariableScopeCodeByVj();
        System.out.println((variables.instanceVariable));
        System.out.println(TEXT);

    }

    public String instanceVariable;
    public VariableScopeCodeByVj()
    {
        instanceVariable = "Instance variable test";

    }


}
