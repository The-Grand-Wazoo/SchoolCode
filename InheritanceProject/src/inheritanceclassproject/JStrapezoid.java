package inheritanceclassproject;

public class JStrapezoid extends JSquadrilateral
{
    protected double base1;
    protected double base2;
    protected double area;
    
    public JStrapezoid( String shapeGiven, double height, double base1Given, double base2Given, double lengthGiven, double widthGiven)
    {
        super(shapeGiven, lengthGiven, widthGiven);
        base1=base1Given;
        base2=base2Given;
    }
    
    public double area()
    {
    	double area;
    	double height = length;
    	
    	area=0.5*height*(base1+base2);
		return area;
    	
    }
    
}
