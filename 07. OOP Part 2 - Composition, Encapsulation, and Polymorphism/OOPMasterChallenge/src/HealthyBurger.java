public class HealthyBurger extends Hamburger {
    private String addition5Name;
    private double addition5Price;
    private String addition6Name;
    private double addition6Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", "brown rye", meat, price);
    }

    public void setAddition5(String addition5Name, double addition5Price) {
        this.addition5Name = addition5Name;
        this.addition5Price = addition5Price;
    }

    public void setAddition6(String addition6Name, double addition6Price) {
        this.addition6Name = addition6Name;
        this.addition6Price = addition6Price;
    }

    @Override
    public double itemizeHamburger() {
        double sum = super.itemizeHamburger();
        if (addition5Name != null) {
            sum += addition5Price;
            System.out.println("Added " + addition5Name + " for an extra " + this.addition5Price + "$");
        }
        if (addition6Name != null) {
            sum += addition6Price;
            System.out.println("Added " + addition6Name + " for an extra " + this.addition6Price + "$");
        }
        return sum;
    }


}
