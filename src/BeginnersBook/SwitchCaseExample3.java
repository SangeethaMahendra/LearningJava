package BeginnersBook;

public class SwitchCaseExample3 {
    public static void main(String[] args) {
             char ch = 'b';
             switch (ch){
                 case 'd':
                     System.out.println("Case1 ");
                     break;
                 case 'b':
                     System.out.println("Case2 ");
                     break;
                 case 'x':
                     System.out.println("Case3 ");
                     break;
                 case 'y':
                     System.out.println("Case4 ");
                     break;
                 default:
                     System.out.println("Default ");
             }
    }
}
// output : case2