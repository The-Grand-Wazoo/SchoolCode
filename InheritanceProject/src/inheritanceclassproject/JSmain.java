package inheritanceclassproject;

public class JSmain 
{
    public static void main(String[] args)
    {
        JSrectangle rectangle=new JSrectangle("rectangle",2.0,3.0);
        rectangle.outPut();
        JSsquare square=new JSsquare("square",6.0,6.0);
        square.outPut();
        JStrapezoid trapezoid=new JStrapezoid("trapezoid",5.0,3.0,4.0,0);
        trapezoid.outPut();
       
    }

}