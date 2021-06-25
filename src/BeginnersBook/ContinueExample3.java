package BeginnersBook;

public class ContinueExample3 {
    public static void main(String[] args) {
        int j =0;
        do{
            if(j==7){
                j++;
                continue;
            }
            System.out.println(j + " ");
            j++;
        }while(j<10);
    }
}
// output :0
//1
//2
//3
//4
//5
//6
//8
//9