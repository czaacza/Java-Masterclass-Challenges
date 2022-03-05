public class Hamburger {
    private String name;
    private String breadRollType;
    private String meat;
    private double price;

    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String breadRollType, String meat, double price) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;
    }

    public void setAddition1(String addition1Name, double addition1Price) {
        this.addition1Name = addition1Name;
        this.addition1Price = addition1Price;
    }

    public void setAddition2(String addition2Name, double addition2Price) {
        this.addition2Name = addition2Name;
        this.addition2Price = addition2Price;
    }

    public void setAddition3(String addition3Name, double addition3Price) {
        this.addition3Name = addition3Name;
        this.addition3Price = addition3Price;
    }

    public void setAddition4(String addition4Name, double addition4Price) {
        this.addition4Name = addition4Name;
        this.addition4Price = addition4Price;
    }

    public double itemizeHamburger() {
        double sum = this.price;
        System.out.println(this.name + " hamburger on a " + this.breadRollType + " bread, with " +
                this.meat + " meat");
        if (addition1Name != null) {
            sum += addition1Price;
            System.out.println("Added " + addition1Name + " for an extra " + this.addition1Price + "$");
        }
        if (addition2Name != null) {
            sum += addition2Price;
            System.out.println("Added " + addition2Name + " for an extra " + this.addition2Price + "$");
        }
        if (addition3Name != null) {
            sum += addition3Price;
            System.out.println("Added " + addition3Name + " for an extra " + this.addition3Price + "$");
        }
        if (addition4Name != null) {
            sum += addition4Price;
            System.out.println("Added " + addition4Name + " for an extra " + this.addition4Price + "$");
        }
        return sum;
    }

    public String getName() {
        return name;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public String getAddition1Name() {
        return addition1Name;
    }

    public double getAddition1Price() {
        return addition1Price;
    }

    public String getAddition2Name() {
        return addition2Name;
    }

    public double getAddition2Price() {
        return addition2Price;
    }

    public String getAddition3Name() {
        return addition3Name;
    }

    public double getAddition3Price() {
        return addition3Price;
    }

    public String getAddition4Name() {
        return addition4Name;
    }

    public double getAddition4Price() {
        return addition4Price;
    }
}
