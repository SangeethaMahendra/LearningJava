package BeginnersBook;

public class WhileLoopExample2 {
    public static void main(String[] args) {
        int i = 10;
        while(i>1){
            System.out.println(i);
            i++;
        }
    }
}
// output : infinite loop
//This loop would never end, its an infinite while loop.
// This is because condition is i>1 which would always be true as we are incrementing the value of i inside while loop.