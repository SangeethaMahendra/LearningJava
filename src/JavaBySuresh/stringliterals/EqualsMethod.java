package JavaBySuresh.stringliterals;

public class EqualsMethod {
    public static void main(String[] args) {
        String s1 = "VJ";
        String s2 = "VJ";
        boolean flag = s1.equals(s2);
        if (flag)
        {
            System.out.println("2 String Objects are equal ");
        }
        else
        {
            System.out.println("2 String Objects are not equal ");
        }

        String s3 = "VJ";
        String s4 = "Vj";
        boolean flag1 = s3.equalsIgnoreCase(s4);
        if (flag1)
        {
            System.out.println("2 String Objects are equal ");
        }
        else
        {
            System.out.println("2 String Objects are not equal ");
        }

    }
}
