package pl.czacza;

import java.util.Scanner;

public class X {
    private int x;

    public X(Scanner x) {
        System.out.println("Please eneter a number");
        this.x = x.nextInt();
        x.nextLine();
    }

    public void x() {
        for (int x = 0; x <= 12; x++) {
            System.out.println(this.x + " * " + x + " = " + this.x * x);
        }
    }
}
