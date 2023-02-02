package Java;

import java.util.LinkedList;

public class Queue {

    public static void main(String[] args) {

        LinkedList cola = new LinkedList<>();
        // System.out.println(cola.getFirst());
        cola.add(16);
        cola.add(12);
        cola.add(234);

        System.out.println("Empty?:" + cola.isEmpty());

        System.out.println("Size: " + cola.size());

        System.out.println(cola.getLast());

        cola.poll();

        System.out.println(cola.peek());

        System.out.println("Empty?:" + cola.isEmpty());

        cola.remove();
        cola.remove();

        System.out.println("Empty?:" + cola.isEmpty());
        cola.remove();

    }

}
