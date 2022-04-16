public class Main {
    public static void main(String[] args) {
//      ZADANIE 1 - Cilinder
        Cilinder cilinder = new Cilinder(5.55, 7.25);
        System.out.println("Radius: " + cilinder.getRadius());
        System.out.println("Height: " + cilinder.getHeight());
        System.out.println("Area: " + cilinder.getArea());
        System.out.println("Volume: " + cilinder.getVolume());

//      ZADANIE 2 - Pool Area
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());
        Cuboid cuboid = new Cuboid(5,10,5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());
    }
}
