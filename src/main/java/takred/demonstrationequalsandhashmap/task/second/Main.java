package takred.demonstrationequalsandhashmap.task.second;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String name = "Андрей";
        Key key = new Key(name, 1334);
        Key key2 = new Key("Александр", 692);

        HashMap<Key, Integer> hashMap = new HashMap<>();

        System.out.println("Добавляем две пары в hashMap");
        hashMap.put(key, 100);
        hashMap.put(key2, 200);
        System.out.println();

        System.out.println("Для проверки пытаемся достать значения по ключу.");
        System.out.println(hashMap.get(key) + " - значение по 1-ому ключу.");
        System.out.println(hashMap.get(key2) + " - значение по 2-ому ключу.");
        System.out.println();

        System.out.println("Теперь изменим значение 1-го ключа, предварительно сохранив старое его значение, а 2-ой оставим без изменений.");
        String savedName = name;
        key.setName("Андрюха");
        System.out.println();

        Integer value = 1;
        for (int i = 0; i < 50; i++) {
            hashMap.put(new Key(value.toString(), value), value);
            value++;
        }

        System.out.println("Теперь снова попытаемся достать значения по ключам.");
        System.out.println(hashMap.get(key) + " - значение по 1-ому ключу.");
        System.out.println(hashMap.get(key2) + " - значение по 2-ому ключу.");
        System.out.println();

        System.out.println("Как и ожидалось, по изменённому ключу найти ничего не удалось, но помещённые в hashMap данные не удалились.");
        System.out.println("Для демонстрации этого пытаемся достать значение по старому ключу.");
        key.setName(savedName);
        System.out.println(hashMap.get(key) + " - значение по старому ключу.");
        System.out.println();

        System.out.println("Для избегании подобных казусов поля ключа следует делать неизменяемыми.");
    }
}
