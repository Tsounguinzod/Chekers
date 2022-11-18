package Co_Beaudelaire.chess.common;

import Co_Beaudelaire.chess.common.Columns;

import java.util.Objects;

public class Location {
    private final Columns columns;
    private final Integer rows;

    public Location(Columns columns, Integer rows){
        this.columns = columns;
        this.rows = rows;
    }

    public Columns getColumns() {
        return columns;
    }

    public Integer getRows() {
        return rows;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Location)) return false;
        Location location = (Location) o;
        return columns == location.columns && Objects.equals(rows, location.rows);
    }

    @Override
    public int hashCode() {
        return Objects.hash(columns, rows);
    }

}
