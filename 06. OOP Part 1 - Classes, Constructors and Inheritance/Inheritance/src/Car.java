public class Car extends Vehicle{

    String engine;
    int capacity;

    public Car(int speed, int size, boolean isLoud, String engine, int capacity) {
        super(speed, size, isLoud, 4);
        this.engine = engine;
        this.capacity = capacity;
    }
    public void turnOn(String engine){
        System.out.println(engine + " turned on.");
    }

    @Override
    public void move(){
        turnOn(this.engine);
        super.move();
    }
}
