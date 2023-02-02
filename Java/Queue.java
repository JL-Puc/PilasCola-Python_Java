package Java;

import java.util.LinkedList;

public class Queue {
    
    public static void main(String[] args) {
        
        LinkedList cola = new LinkedList<>();

        cola.add(16);
        cola.add(12);
        cola.add(234);

        System.out.println("Empty?:"+ cola.isEmpty());

        System.out.println("Size: " + cola.size());


        System.out.println(cola.getLast()); 
        cola.getFirst();
        System.out.println(cola.getFirst()); 
        cola.getFirst();
        System.out.println(cola.getFirst()); 
        cola.getFirst();


        System.out.println("Empty?:"+ cola.isEmpty());
        
        cola.peek();



    }


}
