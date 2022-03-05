package challenge;

import mycompany.Dimensions;

public class Main {
    public static void main(String[] args) {
        Pillow pillow = new Pillow(new Dimensions(10, 1, 2), true);
        Bed bed = new Bed(new Dimensions(20, 10, 5), pillow, 4);
        Table table = new Table(new Dimensions(10, 6, 1), "brown");
        Closet closet = new Closet(new Dimensions(10, 10, 7), 10, "Dark brown");
        Chair chair = new Chair("D300", "AKRacing", "Blue");
        Furniture furniture = new Furniture(closet, table, chair);
        Floor floor = new Floor("Wood", "Lightbrown");
        Room room = new Room(bed, furniture, floor);
        room.cleanRoom();
        room.isComfortable();

    }
}
