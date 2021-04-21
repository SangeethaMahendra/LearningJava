public class PrimitiveDataTypes {
    public static void main(String[] args) {
        /* Boolean data type is used to store only two possible values: true and false
        default size = 1bit, default value is false */
        boolean one = false;
        System.out.println(false);

        /* Byte data type saves memory in large arrays where the memory savings is most required
        value-range between -128 to 127; default size = 1 byte; default value = 0 */
        byte two = 10;
        byte three = -100;
        System.out.println(two + " " + three) ;

        /* Short minimum value is -32,768 and maximum value is 32,767, default value is 0, default size is 2 bytes*/
        short s = 10000;
        short r = -31000;
        System.out.println(s + " " + r);

        /* Char data type is a single 16-bit Unicode character.It is used to store characters.
        default size = 2 bytes, default value = '\u0000' */
        char letterA = 'a';
        System.out.println(letterA);

        /* int value-range lies between - 2,147,483,648 (-2^31) to 2,147,483,647 (2^31 -1)
        Int default size = 4 bytes; default value = 0 */
        int a = 100000;
        int b = -200000;
        System.out.println(a + " " + b);

        /* long value range between (-2^63) to (2^63 -1)(inclusive)
        default value is 0, default size = 8 bytes */
        long al = 100000;
        long bl = -200000;
        System.out.println(al + " " + bl);

        /* float data type is a single-precision 32-bit. value range is unlimited, default size is 4 bytes */
        float f1 = 230.50f;
        System.out.println(f1);

        /* double data type is a double-precision 64-bit. value range is unlimited, default size is 8 bytes*/
        double d1 = 50000.90;
        double d2 = 5893.086d;
        System.out.println(d1);
        System.out.println(d2);

    }
}
