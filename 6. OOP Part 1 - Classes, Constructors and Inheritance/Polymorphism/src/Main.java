class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;
    private int speed;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.speed = 0;
    }

    public void startEngine() {
        System.out.println("Car engine starting");
    }

    public void accelerate() {
        System.out.println("Car is accelerating");
        speed += 10;
    }

    public void brake() {
        System.out.println("Car is stopping");
        speed = 0;
        engine = false;
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public int getSpeed() {
        return speed;
    }
}

class Ferrari extends Car {
    public Ferrari() {
        super("Ferrari", 10);
    }

    @Override
    public void startEngine() {
        System.out.println("Very loud Ferrari engine sound!!!");
        System.out.println("Engine starting");
        super.startEngine();
    }

    @Override
    public void accelerate() {
        System.out.println("Ferrari speeding up, watch out!");
        super.accelerate();
    }

    @Override
    public void brake() {
        System.out.println("Skrrrr.");
        super.brake();
    }
}

public class Main {
    public static void main(String[] args) {
        Car car;
        for (int i = 0; i < 10; i++) {
            if (i % 3 == 1) {
                car = new Ferrari();
            } else if (i % 3 == 2) {
                car = new Lexus();
            } else {
                car = new Polonez();
            }
            System.out.println("Car name: " + car.getName());
            car.startEngine();
            System.out.println("Car engine turn on: " + car.isEngine());
            System.out.println("Actual speed: " + car.getSpeed());
            car.accelerate();
            System.out.println("Actual speed: " + car.getSpeed());
            car.brake();
            System.out.println("Actual speed: " + car.getSpeed());
            System.out.println("\n");
        }

    }

    class Polonez extends Car {
        public Polonez() {
            super("Polonez", 1);
        }

        @Override
        public void startEngine() {
            System.out.println("Could't start " + getClass().getSimpleName() + " engine.");
            System.out.println("...\nOh it finally started");
            super.startEngine();
        }

        @Override
        public void brake() {
            System.out.println("Main.Polonez can't brake, speed is not changing.");
        }
    }
}
