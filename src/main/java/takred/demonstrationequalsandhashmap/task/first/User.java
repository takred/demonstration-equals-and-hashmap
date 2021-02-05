package takred.demonstrationequalsandhashmap.task.first;

import java.util.UUID;

public class User {
    private final String name;
    private final int age;
    private final Color hairСolor;
    private final UUID id;

    public User(String name, int age, Color hairСolor) {
        this.name = name;
        this.age = age;
        this.hairСolor = hairСolor;
        this.id = UUID.randomUUID();
    }
    public User(String name, int age, Color hairСolor, UUID id) {
        this.name = name;
        this.age = age;
        this.hairСolor = hairСolor;
        this.id = id;
    }


    public User(User user) {
        this.name = user.getName();
        this.age = user.getAge();
        this.hairСolor = user.getHairСolor();
        this.id = user.getId();

    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Color getHairСolor() {
        return hairСolor;
    }

    public UUID getId() {
        return id;
    }

    public User setHairColor(Color color) {
        return new User(this.name, this.age, color, this.id);
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }

        User user = (User) object;
        if (name.equals(user.getName())
                && age == user.getAge()
                && id == user.getId()) {
            return true;
        }
        return false;
    }
}
