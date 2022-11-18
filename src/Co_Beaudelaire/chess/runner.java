package Co_Beaudelaire.chess;

import Co_Beaudelaire.chess.board.Board;
import Co_Beaudelaire.chess.common.Columns;
import Co_Beaudelaire.chess.common.Location;

import java.util.Arrays;

public class runner {
        public static void main(String[] args) {
            Board board = new Board();
//            Location loc = new Location(Columns.A,2);

            board.printBoard();


        }
}
