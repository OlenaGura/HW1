package WayToIT.Lesson1;

public class Bouquet {
    public static void main(String[] args){
        Rose rose1 = new Rose("red", 4);
        Tulip tulip1 = new Tulip("yellow", 5);
        Peony peony1 = new Peony("pink", 3);

        rose1.output();
        tulip1.output();
        peony1.output();
       // System.out.println("Total price of bouquet is: ", rose1.price + tulip1.price + peony1.price);
       // System.out.println(getTotalPrice());
    }
}
