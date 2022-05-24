package WayToIT.Lesson1;

public class Kvitka {
    private String colour;
    private int price;

    public String getColour() {
        return this.colour;
    }

    public void setColour(final String colour) {
        this.colour = colour;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(final int price) {
        this.price = price;
    }

    public Kvitka(final String colour, final int price) {
        this.colour = colour;
        this.price = price;
    }

    public Kvitka(final String colour) {
        this.colour = colour;
    }

    public Kvitka(final int price) {
        this.price = price;
    }

    public Kvitka () {};

    @Override
    public String toString() {
        return "colour=" + colour + ", price=" + price;
    }
    public void output() {
        System.out.println(toString());
    }
// static void costOfBouquet(int price) {
//             Kvitka.price = +Kvitka.price;
// }


}
