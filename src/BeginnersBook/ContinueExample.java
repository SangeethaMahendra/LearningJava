package BeginnersBook;

public class ContinueExample {
    public static void main(String[] args) {
        for(int j=0; j<=6; j++)
        {
            if(j==4){
                continue;
            }
            System.out.println(j + "");
        }

    }
}
// output: 0
//1
//2
//3
//5
//6

//As you may have noticed, the value 4 is missing in the output, why? because when the value of variable j is 4, the program encountered a continue statement,
// which makes it to jump at the beginning of for loop for next iteration, skipping the statements for current iteration
// (that’s the reason println didn’t execute when the value of j was 4).