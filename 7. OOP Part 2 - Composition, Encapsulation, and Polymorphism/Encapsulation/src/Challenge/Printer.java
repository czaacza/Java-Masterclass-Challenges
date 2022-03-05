package Challenge;

public class Printer {
    private double tonerLevel = 1;
    private int pagesPrinted;
    private boolean isDuplex;

    public Printer(double tonerLevel, int pagesPrinted, boolean isDuplex) {
        if (tonerLevel >= 0 && tonerLevel < 1)
            this.tonerLevel = tonerLevel;
        this.pagesPrinted = pagesPrinted;
        this.isDuplex = isDuplex;
    }

    public void fillToner(double tonerAmount) {
        if (tonerAmount > 0)
            this.tonerLevel += tonerAmount;
        if (this.tonerLevel > 1) {
            this.tonerLevel = 1;
        }
    }

    public void printPage(int PagesToPrint) {
        if (PagesToPrint < 0)
            return;
        int finalI = 0;
        for (int i = 1; i < PagesToPrint; i++) {
            if (this.tonerLevel <= 0) {
                this.tonerLevel = 0;
                System.out.println("Not enough toner to print all the pages.");
                System.out.println("Printed " + i+1 + " pages");
                return;
            } else {
                this.pagesPrinted++;
                this.tonerLevel -= 0.1;
                finalI = i;
            }
        }
        System.out.println("Printed " + finalI + " pages");
    }

    public double getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
