import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
 */

public class home4_1 {
    public static void main(String[] args) {
        back();
    }

    static void back(){
        List<String> list = new LinkedList<>();
        list.add("кто-то в буханке жопу нашел");
        list.add("тихо завелся тихо пошел");
        list.add("тихо комбайн стоял на межи");
        list.add("влюбленная пара лежала во ржи");
        System.out.println(list);
        for (int i = 0; i < list.size()/2; i++) {
            Collections.swap(list, i, list.size()-i-1);
        }
        System.out.println("Перевернутый список:");
        System.out.println(list);

    }
}
