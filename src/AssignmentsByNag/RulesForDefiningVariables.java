public class RulesForDefiningVariables {
    public static void main (String[] args){
        //Rules for defining variable by using a-z or A-Z;

        //variable should not start with digits//
        int first = 10;
        int Second = 20;
        System.out.println(first);
        System.out.println(Second);

        //camel-case = lower--upper-lower-upper//
        int thirdNumber = 30;
        System.out.println(thirdNumber);

        //use $ or _ only while defining variable//
        int four$ = 40;
        int $five = 50;
        int Six$ = 60;
        int _six = 70;
        int six_ = 80;
        int seven$Number = 90;
        int eight_Number = 100;
        System.out.println(four$ + " " + $five + " " +Six$ + " " + _six + " " + six_ + " ");
       /* System.out.println($five);
        System.out.println(Six$);
        System.out.println(_six);
        System.out.println(six_); */
        System.out.println(seven$Number);
        System.out.println(eight_Number);

        //use numerics in middle of variable definition//
        //variable should not start with digits//
        int nine9Number = 110;
        System.out.println(nine9Number);






    }
}
