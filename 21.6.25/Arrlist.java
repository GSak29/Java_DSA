import java.util.*;

//capacity until 10th data 
//the capacity of the collection is based on the elements they can hold before they are using resizing
//arraylist default capacity 10 if the capacity is filled 
//new capacity = oldcapacity + (0.5) oldcapacity

public class Arrlist {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        // System.out.println(al.size());
        // int capacity=10;
        // for (int i = 0; i < 15; i++) {
        //     al.add(i);
        //     if(al.size()>capacity){
        //         capacity+=(capacity>>1);
        //         System.out.println("Capacity increased to about "+capacity);
        //     }
        // }
        for(int i=0;i<10;i++){
            al.add(++i);
        }
        System.out.println(al.get(4));
        
        al.add(4,10);
        System.out.println(al.get(4));
        System.out.println(al);
        
        int k=0;
        int[] arr= new int[al.size()];
        for(int i :al){
            arr[k]=i;
            k++;
        }
        for (int i : arr) {
            System.out.print(i);
        }

    }
}