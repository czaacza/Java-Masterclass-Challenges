package challenge;

import mycompany.Dimensions;

public class Closet {
    private Dimensions dimensions;
    private int numberOfShelves;
    private String color;

    public Closet(Dimensions dimensions, int numberOfShelves, String color) {
        this.dimensions = dimensions;
        this.numberOfShelves = numberOfShelves;
        this.color = color;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public int getNumberOfShelves() {
        return numberOfShelves;
    }

    public String getColor() {
        return color;
    }

    public void cleanCloset(){
        System.out.println("Closet cleaned.");
    }
}
