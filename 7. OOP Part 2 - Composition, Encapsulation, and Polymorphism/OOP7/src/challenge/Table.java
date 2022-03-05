package challenge;

import mycompany.Dimensions;

public class Table {
    private Dimensions dimensions;
    private String color;

    public Table(Dimensions dimensions, String color) {
        this.dimensions = dimensions;
        this.color = color;
    }


    public Dimensions getDimensions() {
        return dimensions;
    }

    public String getColor() {
        return color;
    }

    public void cleanTable(){
        System.out.println("Table cleaned.");
    }
}
