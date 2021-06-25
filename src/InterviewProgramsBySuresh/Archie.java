package InterviewProgramsBySuresh;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Archie {
    public static void main(String[] args) {
        Pattern p  = Pattern.compile(args[0]);
         Matcher m = p.matcher(args[1]);
         int count = 0 ;
         while(m.find()){
             count++;
             System.out.println(count);
         }
        }
    }

