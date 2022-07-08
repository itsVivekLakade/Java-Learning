import java.util.*;
class ArrayListDemo {
    public static void main(String[] args){
        ArrayList list=new ArrayList();
        list.add(10);
        list.add(5);
        list.add(7);
        list.add(2);
        list.add(4);

        System.out.println("ArrayList: "+list);

        System.out.println("Printing through Iterator");
        Iterator i = list.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

        System.out.println("===Get Set Methods===");
        System.out.println("Get 2nd Element: "+list.get(1));
        System.out.println("Set 2nd Element To 6 : "+list.set(1,6));
        for (Object x:list){
            System.out.println(x);
        }

        System.out.println("===Sorting===");
        Collections.sort(list);
        for (Object x:list){
            System.out.println(x);
        }

        System.out.println("===Removing 2nd Element===");
        list.remove(1);
        for (Object x:list){
            System.out.println(x);
        }

        System.out.println("===Size Of ArrayList===");
        System.out.println(list.size());
    }
}
