public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "White", "sausage", 5.55);
        HealthyBurger healthyBurger = new HealthyBurger("Sausage", 6.3);

        hamburger.setAddition1("Pickle", 2.5);
        double price = hamburger.itemizeHamburger();
        System.out.println("Hamburger " + hamburger.getName() + " prize: " + price + "$");

        healthyBurger.setAddition1("Banana", 1.2);
        double healthyPrice = healthyBurger.itemizeHamburger();

        DeluxeHamburger deluxeHamburger = new DeluxeHamburger("White", "Beef", 6.5);
        deluxeHamburger.setAddition1("Leaf", 0.5);
        double dbPrice = deluxeHamburger.itemizeHamburger();
    }
}
