package Graph;

import java.util.*;

public class ListDfsBfs {

    static List<List<Integer>> li = new LinkedList<List<Integer>>();
    
    public ListDfsBfs(int vertices){
        for(int i=0;i<vertices;i++){
            li.add(new ArrayList<Integer>());
        }
    }

    public static void addEdge(int src,int dist){
            li.get(src).add(dist);
            li.get(dist).add(src);
    }


    public static void display(){
        for(int i=0;i<li.size();i++){
            System.out.print(i+" ");
            for(int j=0;j<li.get(i).size();j++){
                System.out.print(li.get(i).get(j)+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
         ListDfsBfs n = new ListDfsBfs(5);
         addEdge(0,1);
         addEdge(0,2);
         addEdge(0,4);
         addEdge(0,3);
         addEdge(1,3);
         addEdge(1,2);
         addEdge(4,3);

         display();

    }
    
}
