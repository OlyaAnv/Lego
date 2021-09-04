import java.util.Comparator;

public class ComparatorColor implements Comparator<Piece> {
    @Override
    public int compare(Piece o1, Piece o2) {
        return o1.getColor().compareTo(o2.getColor()) + (o1.getItem()- o2.getItem());
    }
}
