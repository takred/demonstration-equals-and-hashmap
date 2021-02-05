package takred.demonstrationequalsandhashmap.task.first;

public class Main {
    public static void main(String[] args) {
        Color color = new Color((short) 255,(short) 21,(short) 21);
        User user = new User("Вася", 29, color);

        Color color2 = new Color((short) 100, (short) 100, (short) 100);
        User user2 = new User(user.getName(), user.getAge(), color2, user.getId());

        User user3 = new User("Вася", 29, color);

        System.out.println(user.equals(user2));
        System.out.println(user.equals(user3));
        System.out.println(user2.equals(user3));
    }
}
