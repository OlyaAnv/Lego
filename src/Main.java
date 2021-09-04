public class Main {

    public static void main(String[] args) {
         Constructor lego = new Constructor(20);
         lego.sort(new ComparatorColor());
         System.out.println("Конструктор Лего");
         lego.print();
         lego.removes("Green");
         System.out.println("Удалили зеленые детали");
         lego.print();
         lego.removes(3);
         System.out.println("Удалили детали-тройки");
         lego.print();
     }
}