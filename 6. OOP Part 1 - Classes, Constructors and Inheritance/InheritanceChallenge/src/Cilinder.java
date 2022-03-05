public class Cilinder extends Circle {
    private double height;

    public Cilinder(double radius, double height) {
        super(radius);
        if (height < 0)
            this.height = 0;
        else
            this.height = height;
    }

    double getHeight(){
        return height;
    }

    double getVolume(){
        return getArea() * getHeight();
    }
}
