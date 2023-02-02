import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack pila = new Stack<>();

        pila.push(5);
        pila.push(12);
        System.out.println(pila.peek());

        pila.push(123);
        System.out.println(pila.peek());

        pila.pop();
        pila.pop();
        System.out.println(pila.peek());

        pila.pop();
        System.out.println("Empty?: " + pila.isEmpty());

        System.out.println(pila.peek());

    }
}   