package Co_Beaudelaire.chess.board;

import Co_Beaudelaire.chess.squares.Square;
import Co_Beaudelaire.chess.squares.SquareColor;
import Co_Beaudelaire.chess.common.Columns;
import Co_Beaudelaire.chess.common.Location;

public class Board {
    Square[][] boardSquares = new Square[8][8];
    SquareColor currentColor;
    public Board(){
        for(int i = 0; i< boardSquares.length; i++){
            int column = 0;
             currentColor = (i%2 == 0)? SquareColor.ROOK : SquareColor.BLACK;
        for(Columns columns : Columns.values()){
            Square newSquare = new Square(currentColor, new Location(columns, i));
            boardSquares[i][column] = newSquare;
            currentColor = (currentColor == SquareColor.BLACK) ? SquareColor.ROOK : SquareColor.BLACK;
            column++;
        }
        }

    }
    public void printBoard(){
        for(Square[] row : boardSquares){
            for(Square square : row){
                System.out.print(square);
            }
            System.out.println();
        }
    }
}
