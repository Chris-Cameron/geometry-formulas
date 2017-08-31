
/**
 * Write a description of class Geometry here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Geometry 
{
    
     /**
     * Sings the second line
     *
     * @param animal (as a word) for which animal is on the farm
     */
    public static double triangleArea(double base, double height) 
    {
        double area = base * height / 2.0;
        
        return area;
    }
    
    /**
     * Sings the second line
     *
     * @param animal (as a word) for which animal is on the farm
     */
    public static double rectangleArea(double length, double width) 
    {
        return length * width;
    }
    
     /**
     * Sings the second line
     *
     * @param animal (as a word) for which animal is on the farm
     */
    public static double sphereVolume(double radius) 
    {
        return 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
    }
    
         /**
     * Sings the second line
     *
     * @param animal (as a word) for which animal is on the farm
     */
    public static double paralellogramArea(double base, double height) 
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
        return Math.pow((Math.pow(height, 2) + Math.pow(length, 2)), 0.5);
    }
    
          public static double distanceBetweenPoints(double x1, double x2, double y1, double y2) 
    {
        return Math.pow((Math.pow((x2-x1), 2) * Math.pow((y2-y1), 2)),0.5);
    }
    
          public static double slopeBetweenPoints(double x1, double x2, double y1, double y2) 
    {
        return (y1-y2)/(x1-x2);
    }
    
          public static double triangleAreaSides(double a, double b, double c)
    {
           double p = (a+b+c)/2.0;
           return Math.pow((p*(p-a)*(p-b)*(p-c)), 0.5);
    }
    
    public static void main(String[] args) 
    {
        double ta1 = triangleArea(4.2, 8.1);
        double ta2 = triangleArea(3.0, 123.157);
        
        System.out.println(ta1);
        System.out.println(ta2);
        
        double ra1 = rectangleArea(5.2, 9.3);
        System.out.println(ra1);
        
        double pa1 = paralellogramArea(3.0, 4.0);
        System.out.println(pa1);
        
        double tr1 = trapezoidArea(3.0, 4.0, 5.0);
        System.out.println(tr1);
        
        double rp1 = rectangularPrismVolume(3.0, 4.0, 5.0) ;
        System.out.println(rp1);
        
        double cv1 = coneVolume(3.0,4.0);
        System.out.println(cv1);
        
        double rs1 = rectangularPrismSurfaceArea(3.0, 4.0, 5.0);
        System.out.println(rs1);
        
        double ss1 = sphereSurfaceArea(3.0);
        System.out.println(ss1);
        
        double rt1 = rightTriangleHypotenuse(3.0, 4.0);
        System.out.println(rt1);
        
        double dp1 = distanceBetweenPoints(3.0, 4.0, 5.0, 6.0);
        System.out.println(dp1);
        
        double sp1 = slopeBetweenPoints(3.0, 4.0, 5.0, 6.0);
        System.out.println(sp1);
        
        double ts1 = triangleAreaSides(3.0, 4.0, 5.0);
        System.out.println(ts1);
        
    }
}
