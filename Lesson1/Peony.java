package WayToIT.Lesson1;

public class Peony extends Kvitka{
    public Peony(String colour, int price){
        super(colour, price);
    };

    @Override
    public void output() {
        System.out.println(toString() + " Peony");
    }
}
