
/**
 * Write a description of class Geometry here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Geometry 
{
    
     /**
     * calculates the area of a triangle
     *
     * @param base for the base length of the shape
     * @param height for the height of the shape
     */
    public static double triangleArea(double base, double height) 
    {
        double area = base * height / 2.0;
        
        return area;
    }
    
     /**
     * calculates the area of a rectangle
     *
     * @param length for the length of the shape
     * @param width for the width of the shape
     */
    public static double rectangleArea(double length, double width) 
    {
        return length * width;
    }
    
     /**
     * calculates the area of a parallelogram
     *
     * @param base for the base length of the shape
     * @param height for the height of the shape
     */
    public static double paralellogramArea(double base, double height) 
    {
        return base * height;
    }
    
     /**
     * calculates the area of a trapezoid
     *
     * @param base1 for the smaller base of the shape
     * @param base2 for the larger base of the shape
     * @param height for the height of the shape
     */
    public static double trapezoidArea(double base1, double base2, double height) 
    {
        return (base1+base2)/2.0 * height;
    }
    
     /**
     * calculates the volume of a rectangular prism
     *
     * @param length for the length of the shape
     * @param height for the height of the shape
     * @param width for the width of the shape
     */
    public static double rectangularPrismVolume(double height, double length, double width) 
    {
        return height * length * width;
    }
    
     /**
     * calculates the volume of a cone
     *
     * @param radius for the radius of the shape
     * @param height for the height of the shape
     */
    public static double coneVolume(double radius, double height) 
    {
        return Math.PI * Math.pow(radius, 2) * (height / 3.0);
    }
    
     /**
     * calculates the surface area of a rectangular prism
     *
     * @param length for the length of the shape
     * @param height for the height of the shape
     * @param width for the width of the shape
     */
    public static double rectangularPrismSurfaceArea(double length, double width, double height) 
    {
        return 2.0*((length*width)+(length*height)+(height*width));
    }
    
     /**
     * calculates the surface area of a sphere
     *
     * @param radius for the radius of the shape
     */
    public static double sphereSurfaceArea(double radius) 
    {
        return 4.0 * Math.PI * Math.pow(radius, 2);
    }
    
     /**
     * calculates the length of a right triangle's hypotenuse
     *
     * @param length for the length of the shape (non-hypotenuse side)
     * @param height for the height of the shape (other non-hypotenuse side)
     */
    public static double rightTriangleHypotenuse(double height, double length) 
    {
        return Math.pow((Math.pow(height, 2) + Math.pow(length, 2)), 0.5);
    }
    
     /**
     * calculates the distance between two points based on x,y coordinates
     *
     * @param x1 for the x coordinate of the first point
     * @param y1 for the y coordinate of the first point
     * @param x2 for the x coordinate of the second point
     * @param y2 for the y coordinate of the second point
     */
    public static double distanceBetweenPoints(double x1, double x2, double y1, double y2) 
    {
        return Math.pow((Math.pow((x2-x1), 2) * Math.pow((y2-y1), 2)),0.5);
    }
    
     /**
     * calculates the slope of a line connecting two points based on x,y coordinates
     *
     * @param x1 for the x coordinate of the first point
     * @param y1 for the y coordinate of the first point
     * @param x2 for the x coordinate of the second point
     * @param y2 for the y coordinate of the second point
     */
    public static double slopeBetweenPoints(double x1, double x2, double y1, double y2) 
    {
        return (y1-y2)/(x1-x2);
    }
    
     /**
     * calculates the area of a triangle based on the length of its sides
     *
     * @param a for one side of the triangle
     * @param b for a side of the triangle that isn't a
     * @param c for the remaining side of the triangle
     */
    public static double triangleAreaSides(double a, double b, double c)
    {
           double p = (a+b+c)/2.0;
           return Math.pow((p*(p-a)*(p-b)*(p-c)), 0.5);
    }
    
     /**
     * Prints the results of the geometric formulas
     */
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
