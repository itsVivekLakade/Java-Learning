import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

class QueueDemo {
    public static void main(String[] args){
        Queue q = new LinkedList();
        q.add(10);
        q.add(5);
        q.add(7);
        q.add(2);
        q.add(4);

        System.out.println("Queue: "+q);

        System.out.println("Printing through Iterator");
        Iterator i = q.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

        System.out.println("===Print Peek===");
        System.out.println("Queue Peek: "+q.peek());

        System.out.println("===Remove Peek===");
        System.out.println("Remove Peek: "+q.remove());

        System.out.println("===Size Of Queue===");
        System.out.println("Size: "+q.size());

    }
}
