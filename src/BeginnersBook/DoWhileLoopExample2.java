package BeginnersBook;

public class DoWhileLoopExample2 {
    public static void main(String[] args) {
        int arr[] = {2,11,43,89}; //i starts with 0 as array index starts with 0
        int i =0;
        do{
            System.out.println(arr[i]);
            i++;
        }while(i<4);
    }
}
//output: 2
//11
//43
//89