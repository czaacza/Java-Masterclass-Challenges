package challenge;

import mycompany.Dimensions;

public class Pillow {
    private Dimensions dimensions;
    private boolean isFluffy;

    public Pillow(Dimensions dimensions, boolean isFluffy) {
        this.dimensions = dimensions;
        this.isFluffy = isFluffy;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public boolean isFluffy() {
        return isFluffy;
    }
}
