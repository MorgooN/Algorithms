import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> ll1 = new LinkedList();

        ll1.add("A");
        ll1.add("b");
        ll1.add("c");

        System.out.println(ll1);

        ll1.addFirst("g");
        ll1.addLast("f");

        ll1.set(0,"Q");

        System.out.println(ll1);

        ll1.remove(2);
        System.out.println(ll1);
        for(int i = 0; i < ll1.size(); ++i){
            System.out.println(ll1.get(i) + " ");   // brute for-each
        }

        Iterator<String> it = ll1.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

        ll1.forEach(e->System.out.println(e)); // functional style for-each
    }
}