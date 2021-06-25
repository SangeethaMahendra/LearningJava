package JavaBySuresh.Collection.HashMap;


import java.util.*;

class hashMap{
    //Iterate Hashmap
    void map(){
        Map<String,String> m = new HashMap<>();
        m.put("A","Hyd");
        m.put("C", "Chennai");
        m.put("B", "Delhi");
        m.put("null","null"); //one nul key ; Multiple null value
        m.put("D","null");
        System.out.println("Iterate Hashmap");
        System.out.println(m);
    }
    // Get only keys
    void keys(){
        Map<String,String> m1 = new HashMap<>();
        m1.put("A","Hyd");
        m1.put("C", "Chennai");
        m1.put("B", "Delhi");
        m1.put("null","null"); //one nul key ; Multiple null value
        m1.put("D","null");
        Set<String> keyset =  m1.keySet();
        Iterator<String> i = keyset.iterator();
        System.out.println("Get only keys" );

        while(i.hasNext()){

            System.out.println(i.next());
        }
    }
    // Get only Values from Map object
    void values(){
        Map<String,String> m2 = new HashMap<>();
        m2.put("A","Hyd");
        m2.put("C", "Chennai");
        m2.put("B", "Delhi");
        m2.put("null","null"); //one nul key ; Multiple null value
        m2.put("D","null");
        Collection<String> values = m2.values();
        Iterator<String> i1 = values.iterator();
        System.out.println("Get only Values");
        while(i1.hasNext()){

            System.out.println(i1.next());
        }
    }
    // both keys & Values
    void KeyValue(){
        Map<String,String> m3 = new HashMap<>();
        m3.put("A","Hyd");
        m3.put("C", "Chennai");
        m3.put("B", "Delhi");
        m3.put("null","null"); //one nul key ; Multiple null value
        m3.put("D","null");
        Set<Map.Entry<String,String>> st = m3.entrySet();
        Iterator<Map.Entry<String,String>> i2 = st.iterator();
        System.out.println("Get both keys & Values");
        while(i2.hasNext()){

            System.out.println(i2.next());
        }
    }

    //Approach 2 - both keys & Values using enhanced for loop
    void getKeyGetValue(){
        Map<String,String> m4 = new HashMap<>();
        m4.put("A","Hyd");
        m4.put("C", "Chennai");
        m4.put("B", "Delhi");
        m4.put("null","null"); //one nul key ; Multiple null value
        m4.put("D","null");
        for(Map.Entry me: m4.entrySet()){
            System.out.println(me.getKey() + " " + me.getValue());
        }

    }

}
public class iterateHashMap {
    public static void main(String[] args) {
      hashMap obj = new hashMap();
        obj.map(); // output : {A=Hyd, B=Delhi, C=Chennai, null=null, D=null}
        obj.keys();
        obj.values();
        obj.KeyValue();
        obj.getKeyGetValue();
    }
}
