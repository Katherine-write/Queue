import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        List<String> firstClients = List.of("Anya", "Sveta", "Olya", "Alexandra", "Ruslana", "Olesya", "Vika");
        Queue<String> clientChance = new LinkedList<>(firstClients);

        while(!clientChance.isEmpty()){
            String name = clientChance.poll();
        if (Math.random() < 0.5) {
            System.out.println(name + " сделал новый маникюр");
            clientChance.offer("a friend of " + name);
        } else {
            System.out.println(name + " сделал новый маникюр");
        }}

    }
    }