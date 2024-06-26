package Problem5;

public final class Circle {

    private final double radius;

    public Circle(double radius)
    {
        this.radius=radius;
    }

    public double computeArea()
    {
        return Math.PI * this.radius * this.radius;
    }

    public double getRadius()
    {
        return this.radius;
    }
}
