import java.util.*;

/**
 Реализуйте очередь с помощью LinkedList со следующими методами:
 enqueue() - помещает элемент в конец очереди,
 dequeue() - возвращает первый элемент из очереди и удаляет его,
 first() - возвращает первый элемент из очереди, не удаляя.
 */

public class home4_2 {
    public static void main(String[] args) {
        queue();
    }

    static void queue(){
        LinkedList<Integer> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println("Очередь: " + list);
        boolean flag = true;
        while (flag){
            System.out.print("Введите команду: ");
            String line = scanner.nextLine();
            switch (line){
                case "enqueue":
                    list.add(random.nextInt(100));
                    System.out.println("Очередь: " + list);
                    break;
                case "dequeue" :
                    System.out.println("Номер: " + list.getFirst());
                    list.removeFirst();
                    System.out.println("Очередь: " + list);
                    break;
                case "first" :
                    System.out.println("Клиент с номером " + list.getFirst() + " пройдите в окно");
                    break;
                case "exit" :
                    flag = false;
                    break;
            }
        }
    }
}
