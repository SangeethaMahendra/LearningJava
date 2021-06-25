package JavaBySuresh.Collection.HashMap;

import java.util.HashMap;
import java.util.Map;

class HashmapMethods {
    //How to check whether particular key exist or not?
    void Keys(){
        Map<String, Integer> m = new HashMap<>();
        String ky = "A";
        m.put("A", 10);
        m.put("C", 30);
        boolean flag = m.containsKey(ky);
        // boolean flag = m.containsKey("A");
        if(flag){
            System.out.println("Key exist");
        }else
            System.out.println("Key does not exist");

    }
     //How to check whether particular value exist or not?
    void values(){
        Map<String, Integer> m = new HashMap<>();
         Integer ky = 10;
        m.put("A", 10);
        m.put("C", 30);
        boolean flag = m.containsValue(ky);
        // boolean flag = m.containsKey("A");
        if(flag){
            System.out.println("Value exist");
        }else
            System.out.println("Value does not exist");
    }
      //what is return type of put()?
    void putReturnType(){
        Map<String, Integer> m = new HashMap<>();
        m.put("A", 10);
        m.put("C", 30);
        Integer put = m.put("B", 20);
        System.out.println("return type of put() " + m); // output {A=10, B=20, C=30}
    }

    // get particular value from Map object
    void getParticularMapObj() {
        Map<String, Integer> m1 = new HashMap<>();
        String ky = "C";
        m1.put("A", 10);
        m1.put("C", 30);
        Integer value = m1.get(ky);
        System.out.println("Get particular value from Map object " + "" + value); //Output 30
    }
        //getOrDefault(key,default-value) checks whether key exist or not
        void getOrDefaultKey(){
            Map<String, Integer> m2 = new HashMap<>();
            String ky1 = "D";
            m2.put("A", 10);
            m2.put("C", 30);
           // Integer v = m2.getOrDefault(ky1,100); // if key does not exist then return default-value to end-user
            Integer v = m2.getOrDefault(ky1,10); //if key exist then return value to end-user
            System.out.println("GetOrDefault " + v);
        }

        //putIfAbsent() - putIfAbsent() used to add entry to Map object
           void putIfAbsent1(){
               Map<String, Integer> m3 = new HashMap<>();
              // String ky2 = "D";
               String ky2 = "B";
               m3.putIfAbsent("A", 10);
               m3.putIfAbsent("C", 30);
               m3.putIfAbsent("B", 20);
               for(Map.Entry<String,Integer> me : m3.entrySet()){
                   System.out.println("putIfAbsent " + me.getKey() + " " + me.getValue());
               }


        }

    public static void main(String[] args) {
        HashmapMethods obj = new HashmapMethods();
        obj.Keys();
        obj.values();
        obj.putReturnType();
        obj.getParticularMapObj();
        obj.getOrDefaultKey();
        obj.putIfAbsent1();

    }
}
// output : key exist

