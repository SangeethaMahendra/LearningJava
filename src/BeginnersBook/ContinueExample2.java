package BeginnersBook;

public class ContinueExample2 {
    public static void main(String[] args) {
        int count = 10;
        while(count >= 0)
        {
            if(count == 0)
            {
                count--;
                continue;
            }
            System.out.print(count + "");
            count--;
        }
    }
}
//output : 10987654321
