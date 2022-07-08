import java.util.*;

class HashSetDemo {
    public static void main(String[] args){
        HashSet Hs = new HashSet();
        Hs.add(10);
        Hs.add(5);
        Hs.add(7);
        Hs.add(2);
        Hs.add(4);

        System.out.println("ArrayList: "+Hs);

        System.out.println("Printing through Iterator");
        Iterator i = Hs.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

        System.out.println("===Removing 2nd Element===");
        Hs.remove(4);
        for (Object x:Hs){
            System.out.println(x);
        }

        System.out.println("===Size Of ArrayList===");
        System.out.println(Hs.size());
    }
}
