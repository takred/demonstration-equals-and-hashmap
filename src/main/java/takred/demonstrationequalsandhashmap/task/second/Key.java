package takred.demonstrationequalsandhashmap.task.second;

public class Key {
    public String name;
    public int number;

    public Key(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public void setName(String newName) {
        name = newName;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        Key key = (Key) object;

        if (name.equals(key.name)
                && number == key.number) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + number;
    }
}
