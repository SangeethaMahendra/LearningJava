package Practice;

public class EncapsuleClass1 {
       int a =10;
        private int b = 20;

    void display(){
            System.out.println(a + " " + b);
        }

        int getB() { // it also can be a default modifier . but it is better to declare as public
            return b; //since it is in same package it will be accessible, outside package cant accessible
        }

        public void setB(int b) {
            this.b = b;
        }

        public int getA() { // getters and setters can be naming any, but it is better to practice use get and set names
            return a;
        }

        public void setA(int a) {
            this.a = a;
        }
    }

