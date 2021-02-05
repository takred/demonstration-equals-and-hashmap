package takred.demonstrationequalsandhashmap.task.first;

public class Color {
    private final short red;
    private final short green;
    private final short blue;

    public Color(short red, short green, short blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public short getRed() {
        return red;
    }public short getGreen() {
        return green;
    }public short getBlue() {
        return blue;
    }

    @Override
    public boolean equals(Object object) {
        Color color = (Color) object;
        if (red == color.getRed()
                && green == color.getGreen()
                && blue == color.getBlue()) {
            return true;
        }
        return false;
    }
}
