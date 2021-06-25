package BeginnersBook;

public class ForLoopExample3 {
    public static void main(String[] args) {
        int array[] = {2, 11, 40, 9};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        String arr[] = {"A", "B", "C"};
        for(String str : arr){ // Enhanced for loop
            System.out.println(str);
        }

    }
}
// output : 2
//11
//40
//9