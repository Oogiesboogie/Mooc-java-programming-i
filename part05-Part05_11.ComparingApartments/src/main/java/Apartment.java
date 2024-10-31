
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if (compared.squares < this.squares) {
            return true;
        } else {
            return false;
        }
    }

    public int priceDifference(Apartment compared) {
        int comparedPrice = compared.squares * compared.pricePerSquare;
        int apptPrice = this.squares * this.pricePerSquare;
        if (comparedPrice > apptPrice) {
            return comparedPrice - apptPrice;
        } else {
            return apptPrice - comparedPrice;
        }
    }

    public boolean moreExpensiveThan(Apartment compared) {
        if ((compared.squares * compared.pricePerSquare) < (this.squares * this.pricePerSquare)) {
            return true;
        } else {
            return false;
        }
    }

}
