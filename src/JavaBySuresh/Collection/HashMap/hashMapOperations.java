package JavaBySuresh.Collection.HashMap;

import java.util.HashMap;
import java.util.Map;

public class hashMapOperations {
    // size() method gives number of elements exist as part of Map object
    void sizeMap(){
        Map<String, Integer> m = new HashMap<>();
        m.put("X", 100);
        m.put("Y" , 200);
        m.put("Z", 300);
        System.out.println(m.size());
    }
    //Remove particular entry/remove entry based on key -  remove() method remove value based on key
    void removeEntry(){
        Map<String, Integer> m1 = new HashMap<>();
        //Integer element = 300;
        m1.put("X", 100);
        m1.put("Y" , 200);
        m1.put("Z", 300);
        m1.remove("Z");
        System.out.println(m1);
    }
    // remove(key,value)
    void removeKeyValue(){
        Map<String, Integer> m2 = new HashMap<>();
        Integer element = 300;
        m2.put("X", 100);
        m2.put("Y" , 200);
        m2.put("Z", 300);
        m2.remove("X",100); //remove(key,value) method remove both Key and value
        System.out.println(m2);
    }

    // replace() replace value based on key
    void replaceValue(){
        Map<String, Integer> m3 = new HashMap<>();
        m3.put("X", 100);
        m3.put("Y" , 200);
        m3.put("Z", 300);
       //m3.replace("F", 400); //if key does not match then nothing will do
      //  m3.replace("Y",400); //if key exist then corresponding value replaced by new-value
        m3.replace("Y",200,500); //if both key&value exist then replace old-value by new-value
        System.out.println(m3);
    }
    public static void main(String[] args) {
     hashMapOperations obj = new hashMapOperations();
      obj.sizeMap();
      obj.removeEntry();
      obj.removeKeyValue();
      obj.replaceValue();
    }
}
