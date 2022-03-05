public class DeluxeHamburger extends Hamburger{
    private double chips;
    private double  drink;

    public DeluxeHamburger(String breadRollType, String meat, double price) {
        super("Deluxe Burger", breadRollType, meat, price);
        this.chips = 5;
        this.drink = 5;
    }

    @Override
    public void setAddition1(String addition1Name, double addition1Price) {
        System.out.println("Cannot add any extra additions to Deluxe Hamburger.");
    }

    @Override
    public void setAddition2(String addition2Name, double addition2Price) {
        System.out.println("Cannot add any extra additions to Deluxe Hamburger.");
    }

    @Override
    public void setAddition3(String addition3Name, double addition3Price) {
        System.out.println("Cannot add any extra additions to Deluxe Hamburger.");
    }

    @Override
    public void setAddition4(String addition4Name, double addition4Price) {
        System.out.println("Cannot add any extra additions to Deluxe Hamburger.");
    }

    @Override
    public double itemizeHamburger() {
        System.out.println("Added chips for an extra " + this.chips + "$ and drink for an extra " + this.drink + "$" );
        return super.itemizeHamburger() + this.chips + this.drink;
    }
}
