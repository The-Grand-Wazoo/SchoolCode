package inheritanceclassproject;

public class JSquadrilateral
{
    protected static String shape;
    protected static double length;
    protected static double width;
    //private static double area;
    
    public JSquadrilateral(String shapeGiven, double lengthGiven, double widthGiven)
    {
        shape=shapeGiven;
        length=lengthGiven;
        width=widthGiven;
    }
    public void outPut()
    {
        double area=area();
        System.out.println("The "+shape+" has a length of "+length+" and a width of "+width+".");
        System.out.println("The area of the "+shape+" is "+area+" square units.");
    }
    public double area()
    {
        double area;
        area=length*width;
        return area;
    }
       
}