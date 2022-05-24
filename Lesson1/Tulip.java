package WayToIT.Lesson1;

public class Tulip extends Kvitka {
    public Tulip(String colour, int price) {
        super(colour, price);
    }
        @Override
        public void output () {
            System.out.println(toString() +" Tulip");
        }
    }

