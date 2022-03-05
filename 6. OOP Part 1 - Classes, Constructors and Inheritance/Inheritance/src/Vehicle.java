public class Vehicle {
    int speed;
    int size;
    boolean isLoud;
    int wheels;

    public Vehicle(int speed, int size, boolean isLoud, int wheels) {
        this.speed = speed;
        this.size = size;
        this.isLoud = isLoud;
        this.wheels = wheels;
    }

    public void increaseSpeed(int value){
        this.speed += value;
    }

    public void move(){
        System.out.println("Vehicle moves.");
    }
}
