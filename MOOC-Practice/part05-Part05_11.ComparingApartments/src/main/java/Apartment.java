
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared){
        return this.squares > compared.squares;
    }
    
    public int priceDifference(Apartment compared){
        int compareTotal = compared.princePerSquare * compared.squares;
        int thisTotal = this.princePerSquare * this.squares;
        if (thisTotal > compareTotal){
            return (thisTotal - compareTotal);
        }else{
            return (compareTotal - thisTotal);
        }
    }
    
    public boolean moreExpensiveThan(Apartment compared){
        int compareTotal = compared.princePerSquare * compared.squares;
        int thisTotal = this.princePerSquare * this.squares;
        return thisTotal > compareTotal;
    }
}
