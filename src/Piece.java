public class Piece {
    private final String color;
    private final int item;
    private final String picture;

    public Piece(String color, int item) {
        this.color = color;
        this.item = item;
        switch (item) {
            case 1 -> picture = ".";
            case 2 -> picture = ":";
            case 3 -> picture = ":.";
            default -> picture = "::";
        }
    }

    public String getColor() {
        return color;
    }

    public int getItem() {
        return item;
    }

    @Override
    public String toString() {
        return color + " " + item + " " + picture;
    }
}
