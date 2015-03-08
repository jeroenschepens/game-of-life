package com.wakaleo.gameoflife.domain;

/**
 * Dit is mooie code!
 * Nog mooier!!!
 * 
 * @author sop
 */
public enum Cell {
    LIVE_CELL("*"), DEAD_CELL(".");

    private String symbol;

    private Cell(final String initialSymbol) {
        System.out.println("oke!");
        this.symbol = initialSymbol;
    }

    @Override
    public String toString() {
        return symbol;
    }

    static Cell fromSymbol(final String symbol) {
        Cell cellRepresentedBySymbol = null;
        for (Cell cell : Cell.values()) {
            if (cell.symbol.equals(symbol)) {
                cellRepresentedBySymbol = cell;
                break;
            }
        }
        return cellRepresentedBySymbol;
    }

    public String getSymbol() {
        return symbol;
    }
}
