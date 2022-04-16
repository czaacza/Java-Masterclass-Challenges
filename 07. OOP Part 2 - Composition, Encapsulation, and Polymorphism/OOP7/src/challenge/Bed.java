package challenge;

import mycompany.Dimensions;

public class Bed {
    private Dimensions dimensions;
    private Pillow pillow;
    private int numberOfPillows;

    public Bed(Dimensions dimensions, Pillow pillow, int numberOfPillows) {
        this.dimensions = dimensions;
        this.pillow = pillow;
        this.numberOfPillows = numberOfPillows;
    }

    public void makeTheBed(){
        System.out.println("Making the bed...");
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public Pillow getPillow() {
        return pillow;
    }

    public int getNumberOfPillows() {
        return numberOfPillows;
    }
}
