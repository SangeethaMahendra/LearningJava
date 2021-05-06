package AssignmentsByNag;

public class HalfPyramidUsingAlphabets {
    public static void main(String[] args) {
        //HALF PYRAMID PATTERN USING ALPHABETS
        char a = 'A';
        // char b = 'B';
        // char c = 'C';
        //char d = 'D';
        //char e = 'E';

        for (int i = 1; i <= 5; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print(" " + a);

            }
            ++a;
            System.out.println("");
        }
        //INVERTED HALF PYRAMID PATTERN USING ALPHABETS
        System.out.println("\n");
        char b = 'E';
        for (int i = 5; i >= 1; --i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print(" " + b);
            }
            --b;
            System.out.println("");
        }
    }
}
