class Lexus extends Car {
    boolean isComfortable;

    public Lexus() {
        super("Lexus", 6);
        this.isComfortable = true;
    }

    @Override
    public void startEngine() {
        System.out.println("Comfortable Lexus start. Get ready in your comfy seat");
        super.startEngine();
    }

}
