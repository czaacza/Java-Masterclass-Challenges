public class Coupe extends Car{

    String lights;

    public Coupe(int speed, String lights) {
        super(0, 10, true, "V10", 5);
        this.lights = lights;
    }


    @Override
    public void turnOn(String lights) {
        System.out.println(lights + " turned on.");
    }

    @Override
    public void move() {
        turnOn(engine);
        super.move();
    }

    @Override
    public void increaseSpeed(int value) {
        super.increaseSpeed(100 * value);
    }
}
