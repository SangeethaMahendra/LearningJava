package InterviewProgramsBySuresh;

public class qq20 {
    public static void main(String[] args) {
        System.out.println(method());
    }
    public static int method(){
        try{
            return 3;
        }catch(Exception e){
            return 2;
        }finally{
            return 1;
        }
    }
}

// Output is 1