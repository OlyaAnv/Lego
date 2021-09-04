import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Constructor {
    private String[] colors = {"Red","Green","Blue","Yellow"};
    private final int MAXITEM = 4;
    private List<Piece> constructorList;


    public Constructor(int detailsNumber){
        constructorList = new ArrayList<>();
        Random random = new Random();
        for(int i = 0; i < detailsNumber; i++) {
            constructorList.add(new Piece(colors[random.nextInt(colors.length)],random.nextInt(MAXITEM)+1));
        }
    }

    public void removes(String color){
        Iterator iterator = constructorList.iterator();
        while (iterator.hasNext()) {
            Piece piece = (Piece) iterator.next();
            if(piece.getColor().equals(color))
                iterator.remove();
        }
    }

    public void removes(int item){
        Iterator iterator = constructorList.iterator();
        while (iterator.hasNext()) {
            Piece piece = (Piece) iterator.next();
            if(piece.getItem() == item)
                iterator.remove();
        }
    }

    public void print(){
        System.out.println("_____________");
        for(Object p:constructorList)
            System.out.println(p);
        System.out.println("_____________");
        System.out.println("Всего деталей:" + constructorList.size() + "шт.");
        System.out.println();
    }

    public void sort(ComparatorColor comparatorColor) {
        constructorList.sort(comparatorColor);
    }
}
