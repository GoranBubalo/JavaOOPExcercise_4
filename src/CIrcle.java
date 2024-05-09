public class CIrcle {

    private double radius;

    public CIrcle(){}

    public CIrcle(double radius){
        this.radius = radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;
    }

    public double getArea(){
        return Math.PI * this.radius * this.radius;
    }
    public double getCircumference(){
        return 2* Math.PI *  this.radius;
    }


}
