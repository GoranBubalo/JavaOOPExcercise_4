public class Main {
    public static void main(String[] args) {

        /*
        * 4. Write a Java program to create a class called "Circle" with a
        * radius attribute. You can access and modify this attribute.
        *  Calculate the area and circumference of the circle.
        * */

        //Accessing and modifying attribute from here
        int newValue = 5;
        CIrcle circle = new CIrcle(newValue);
        System.out.println("Area of Circle is " + circle.getArea());
        System.out.println("The Circumference of the circle is: " + circle.getCircumference());
        System.out.println();
        newValue = 8;
        circle.setRadius(newValue);
        System.out.println("Area of Circle is " + circle.getArea());
        System.out.println("The Circumference of the circle is: " + circle.getCircumference());
    }
}