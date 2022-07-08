import java.util.*;
class HashMapDemo {
    public static void main(String[] args){
        HashMap<Integer,String> Hm = new HashMap<Integer, String>();
        Hm.put(1,"Vivek");
        Hm.put(2,"Akshay");
        Hm.put(3,"Ganesh");
        Hm.put(4,"Firoj");
        Hm.put(5,"Suraj");

        System.out.println("HashMap: "+Hm);

        System.out.println("Printing through Iterator");
        for(Map.Entry i : Hm.entrySet()){
            System.out.println(i.getKey()+ " " +i.getValue());
        }

        System.out.println("===Replace===");
        Hm.replace(5,"Shailesh");
        for(Map.Entry i : Hm.entrySet()){
            System.out.println(i.getKey()+ " " +i.getValue());
        }

        System.out.println("===Remove===");
        Hm.remove(5);
        for(Map.Entry i : Hm.entrySet()){
            System.out.println(i.getKey()+ " " +i.getValue());
        }
    }
}
