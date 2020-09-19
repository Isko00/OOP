package oop.bonus.task3;

public class Pair {
//    private final char name;
    private final int rowNumber, columnNumber;

    public Pair() {
//        name = 'a';
        rowNumber = 0;
        columnNumber = 0;
    }

    public Pair(/*char name, */int rowNumber, int columnNumber) {
//        this.name = name;
        this.rowNumber = rowNumber;
        this.columnNumber = columnNumber;
    }

    public int getRow() { return rowNumber; }
    
    public int getColumn() { return columnNumber; }

    public boolean isNeibor(Pair c) {
        return (rowNumber - c.getRow() <= 1
            && columnNumber - c.getColumn() <= 1);
    }

    public String toString() {
        return /*"Name: " + name 
                + */"Row: " + rowNumber
                + "\nColumn: " + columnNumber;
    }
}