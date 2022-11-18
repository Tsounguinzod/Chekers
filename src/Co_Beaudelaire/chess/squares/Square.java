package Co_Beaudelaire.chess.squares;

import Co_Beaudelaire.chess.common.Location;
import Co_Beaudelaire.chess.squares.SquareColor;

public class Square {
    private final SquareColor squareColor;
    private final Location location;
    private static boolean isOccupied;

    public  Square(SquareColor squareColor, Location location){
        this.location = location;
        this.squareColor = squareColor;
    }

    public void reset(){
    }

    public SquareColor getSquareColor() {
        return squareColor;
    }

    public Location getLocation() {
        return location;
    }

    public void setOccupied(boolean occupied) {
    }

    @Override
    public String toString() {
        return "" + squareColor + " ";

            /*    "Square{" +
                "squareColor=" + squareColor +
             //   ", location=" + location +
                ", isOccupied=" + isOccupied +
                '}';
            */
    }

}
