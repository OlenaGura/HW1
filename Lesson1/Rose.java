package WayToIT.Lesson1;

public class Rose extends Kvitka{


    public Rose(String colour, int price) {
        super(colour, price);
    }
        @Override
        public void output() {
            System.out.println(toString() +" Rose");
        }
    }

