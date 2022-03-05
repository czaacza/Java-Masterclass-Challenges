package challenge;

public class Floor {
    private String material;
    private String color;

    public Floor(String material, String color) {
        this.material = material;
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public void cleanFloor(){
        System.out.println("Floor cleaned.");
    }
}
