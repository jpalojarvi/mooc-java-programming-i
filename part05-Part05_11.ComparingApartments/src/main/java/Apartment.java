
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment comparedApartment) {
        if (this.squares > comparedApartment.squares) {
            return true;
        }
        return false;
    }

    public int priceDifference(Apartment comparedApartment) {
        int nonAbsValue = (this.princePerSquare * this.squares - comparedApartment.princePerSquare * comparedApartment.squares);

        if (nonAbsValue > 0) {
            return nonAbsValue;
        }
        return nonAbsValue * -1;

        // fancier way
        // return Math.abs(this.princePerSquare*this.squares-comparedApartment.princePerSquare*comparedApartment.squares);
    }
    
    public int priceDifferenceNoAbsolutes(Apartment comparedApartment){
        return this.princePerSquare*this.squares-comparedApartment.princePerSquare*comparedApartment.squares;
    }
    
    public boolean moreExpensiveThan(Apartment comparedApartment){
        if (this.priceDifferenceNoAbsolutes(comparedApartment) > 0) {
            return true;
        }
        return false;
    }

    public int getSquares() {
        return squares;
    }

    public int getPrincePerSquare() {
        return princePerSquare;
    }
    
    
}
