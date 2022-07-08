import java.util.*;

class LinkedListDemo {
    public static void main(String[] args){
        LinkedList Ll=new LinkedList();
        Ll.add(10);
        Ll.add(5);
        Ll.add(7);
        Ll.add(2);
        Ll.add(4);

        System.out.println("LinkedList: "+Ll);

        System.out.println("Printing through Iterator");
        Iterator i = Ll.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

        System.out.println("===Get Set Methods===");
        System.out.println("Get 2nd Element: "+Ll.get(1));
        System.out.println("Set 2nd Element To 6 : "+Ll.set(1,6));
        for (Object x:Ll){
            System.out.println(x);
        }

        System.out.println("===Sorting===");
        Collections.sort(Ll);
        for (Object x:Ll){
            System.out.println(x);
        }

        System.out.println("===Removing 2nd Element===");
        Ll.remove(1);
        for (Object x:Ll){
            System.out.println(x);
        }

        System.out.println("===Size Of LinkedList===");
        System.out.println(Ll.size());
    }
}
