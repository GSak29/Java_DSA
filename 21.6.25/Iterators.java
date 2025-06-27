import java.util.*;

public class Iterators {
    public static void main(String[] args) {
        List<List<Integer>> li = new ArrayList<List<Integer>>();
        System.out.println(li);
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        li.add(a);
        List<Integer> b = new ArrayList<>();
        b.add(5);
        b.add(6);
        b.add(7);
        li.add(b);
        System.out.println(li);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < li.get(i).size(); j++) {
                System.out.print(li.get(i).get(j) + " ");
            }
            System.out.println();
        }
        for (List<Integer> i : li) {

            System.out.println(i);

        }
        
        
       //iterato 
        Iterator<Integer> it = a.iterator();

        // hasNext---> boolean next---> data
        while (it.hasNext()) {
            Integer k = it.next();
            System.out.println(k);
        }
    }
}
