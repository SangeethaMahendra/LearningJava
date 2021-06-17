package JavaBySuresh.stringliterals;

public class StringMethodsDemo {
          // STARTSWITH()
    public void start() {
        String s = "Sangeetha";
        boolean flag = s.startsWith("Sam");
        if (flag) {
            System.out.println("Strins is" + flag);
        } else {
            System.out.println("String is " + flag);
        }

    }
      // ENDWITH()
       public void end(){
        String s1 = "Sangeetha";
        boolean flag1 = s1.endsWith("tha");
        System.out.println("String is " + flag1);
    }
    // codePointAt(int index) Returns the char value at the specified index. An index ranges from 0 to length()
    // Every char maintain ASCII codes.
    // codePointAt() take the char as given index and convert it to ASCII code value and display
    public void codePoint(){
        String s2 = "Sangeetha";
        int codeValue = s2.codePointAt(0);
        System.out.println("String is " + codeValue);
    }

    //codePointBefore() take the char as given index and convert it to ASCII code value and given ASCII value before given index
    public void codePointBefore1(){
        String s3 = "Sangeetha";
        int codeValue1 = s3.codePointBefore(1);
        System.out.println("String is " + codeValue1);
    }

    // contains() Check whether given pattern is available in the given string at any point of time; but sequence is mandatory
    // it returns true if given pattern matches, it calculate spaces too

    public void contain(){
        String s4 = "Sangeetha";
        boolean f = s4.contains("gee");
        if (f){
            System.out.println("given sequence exist");
        }
        else{
            System.out.println("given sequence not exist");
        }
        }

        //contentEquals() Exact content should be equal
    public void contentE(){
        String s5 = "Sangeetha";
        boolean fl = s5.contentEquals("geetha");
        System.out.println(fl);
    }
    // getBytes() it takes each char and coverts into ASCII code and returns each char ASCII code value

    public void getBy(){
        String s6 = "Sangeetha";
        byte[] by= s6.getBytes();
        for(byte b:by){
            System.out.println(b);
        }
    }
     // getChars()
     public void getCh(){
         String s7 = "Sangeetha";
         char[] ch = new char[6];
         s7.getChars(0,6, ch, 0);
         for(char temp : ch) {
             System.out.println(temp);
         }

     }

}
class driver
{
    public static void main(String[] args) {
       StringMethodsDemo d  = new StringMethodsDemo();
       d.start();
       d.end();
       d.codePoint();
       d.codePointBefore1();
       d.contain();
       d.contentE();
       d.getBy();
       d.getCh();
    }
}
