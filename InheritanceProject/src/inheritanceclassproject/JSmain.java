package inheritanceclassproject;

public class JSmain 
{

    
    public static void main(String[] args)
    {
        JSrectangle rectangle=new JSrectangle("rectangle",2.0,3.0);
        JSsquare square=new JSsquare("square",6.0,6.0);
        JStrapezoid trapezoid=new JStrapezoid("trapezoid",5.0,3.0,5.0,0,0);
        trapezoid.outPut();
        rectangle.outPut();
        square.outPut();
        //System.out.println("test");
    }

}