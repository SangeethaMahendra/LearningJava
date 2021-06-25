package JavaBySuresh.Collection;

import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        String[] str = {"A","B","C"};
        ArrayList<String> a = new ArrayList<>();
        for(String temp:str){
            a.add(temp);
        }
        System.out.println(a);
    }
}
