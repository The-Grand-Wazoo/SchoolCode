package inheritanceclassproject;

public class JStrapezoid extends JSquadrilateral
{
    protected double base1;
    protected double base2;
   
    private double height = length;
    public JStrapezoid( String shapeGiven,  double base1Given, double base2Given, double lengthGiven, double widthGiven)
    {
        super(shapeGiven, lengthGiven, widthGiven);
        base1=base1Given;
        base2=base2Given;
    }
    
    public double area()
    {
    	double area;
    	area=0.5*height*(base1+base2);
		return area;
    	
    }
    
    public void outPut()
    {
    	double area=area();
        System.out.println("The "+shape+" has a base of "+base1+", a second base of "+base2+", and a height of "+length+".");
        System.out.println("The area of the "+shape+" is "+area+" square units.");
    }
    
}
 