import static java.lang.Math.pow;

public class Circle {
    private Point center;
    private double radius = 1.0;
    public Circle(double x, double y, double radius){
        this.center = new Point(x,y);
        this.radius = radius;
    }
    public void setCenter(double x,double y){
        center.setXY(x,y);
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double area(){
        return(3.14 * pow(radius,2.0));
    }
    public double circumference(){
        return (2*3.14*radius);
    }
    public boolean isBiggerthan(Circle oponent){
        if(this.area() > oponent.area()){
            return true;
        }
        else {
            return false;
        }
    }
    @Override
    public String toString(){
        return("Circle at X - " + center.getX() +
                ", Y - " + center.getY() +
                ", with radius - " + radius + " cm. " +
                " area - " + this.area() + " cm^2. " +
                " circumference - " + this.circumference() + " cm.");
    }
}
