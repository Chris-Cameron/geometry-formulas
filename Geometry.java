
/**
 * Write a description of class Geometry here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Geometry 
{
    
    public static double triangleArea(double base, double height) 
    {
        double area = base * height / 2.0;
        
        return area;
    }
    
    public static double rectangleArea(double length, double width) 
    {
        return length * width;
    }
    
    public static double sphereVolume(double radius) 
    {
        return 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
    }
    
      public static double pararlellogramArea(double base, double height) 
    {
        return base * height;
    }
    
          public static double trapezoidArea(double base1, double base2, double height) 
    {
        return (base1+base2)/2.0 * height;
    }
    
          public static double rectangularPrismVolume(double height, double length, double width) 
    {
        return height * length * width;
    }
    
          public static double coneVolume(double radius, double height) 
    {
        return Math.PI * Math.pow(radius, 2) * (height / 3.0);
    }
    
          public static double rectangularPrismSurfaceArea(double length, double width, double height) 
    {
        return 2.0*((length*width)+(length*height)+(height*width));
    }
    
          public static double sphereSurfaceArea(double radius) 
    {
        return 4.0 * Math.PI * Math.pow(radius, 2);
    }
    
          public static double rightTriangleHypotenuse(double height, double length) 
    {
        Math.pow((Math.pow(height, 2) * Math.pow(length, 2)), 0.5);
    }
    
          public static double distanceBetweenPoints(double x1, ) 
    {
        
    }
    
          public static double slopeBetweenPoints() 
    {
        
    }
    
    
    public static void main(String[] args) 
    {
        double ta1 = triangleArea(4.2, 8.1);
        double ta2 = triangleArea(3.0, 123.157);
        
        System.out.println(ta1);
        System.out.println(ta2);
        
        double ra1 = rectangleArea(5.2, 9.3);
        System.out.println(ra1);
    }
}
