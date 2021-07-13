package JavaBySuresh.ListQA;

import JavaBySuresh.Collection.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class convertArrayToArrayList {
    public static void main(String[] args) {
        String[] str = {"A","B","C"};
        List<String> al = Arrays.asList(str);
//        ArrayList<String> al = new ArrayList();
//        for(String temp:str){
//            al.add(temp);
//        }
        System.out.println(al);
    }

}
