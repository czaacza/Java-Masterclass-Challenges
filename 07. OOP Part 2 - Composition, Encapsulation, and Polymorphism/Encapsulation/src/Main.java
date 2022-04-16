import Challenge.Printer;

public class Main {
    public static void main(String[] args) {
//        Player player = new Player();
//        player.fullName = "Mati";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

//        EnhancedPlayer player = new EnhancedPlayer("Mati", 500, "Sword");
//        System.out.println("Initial health is " + player.getHealth());
//        player.loseHealth(10);
//        player.loseHealth(40);
//        System.out.println("Initial health is " + player.getHealth());

        Printer printer = new Printer(2,0,false);
        printer.printPage(15);
        System.out.println("Toner level: " + printer.getTonerLevel());
        System.out.println("Pages printed: " + printer.getPagesPrinted());
    }
}
