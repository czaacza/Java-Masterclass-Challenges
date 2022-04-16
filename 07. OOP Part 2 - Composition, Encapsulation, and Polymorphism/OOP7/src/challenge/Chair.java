package challenge;

public class Chair {
    private String name;
    private String manufacturer;
    private String color;

    public Chair(String name, String manufacturer, String color) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getColor() {
        return color;
    }

    public void cleanChair() {
        System.out.println("Chair cleaned.");
    }
}
