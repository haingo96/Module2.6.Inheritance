package Exercise1;

public class Cylinder extends Circle{
    private double height = 1;

    public Cylinder(){
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return super.getPerimeter() * height + 2 * super.getArea();
    }

    public double getVolume() {
        return super.getArea() * height;
    }

    @Override
    public String toString() {
        return String.format("radius = %s, area = %s, volume = %s", super.getRadius(), getArea(), getVolume());
    }
}
