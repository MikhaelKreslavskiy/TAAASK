
import java.util.Scanner;

/**
 * Created by schooler on 13.10.18.
 */
public class Line {

    Point A;
    Point B;

    
    public Line(Point a, Point b) {
        A = a;
        B = b;

    }

	
    public Line(double x1, double y1, double x2, double y2) {
        A = new Point(x1, y1);
        B = new Point(x2, y2);

    }
    
    
    public void show(Point A,Point B) {
        System.out.println("1st(x,y)  " + A.x + "  ;" + A.y);
        System.out.println("2nd(x,y)  " + B.x + "   ;" + B.y);


    }

    public void Angle() {
        double Xr = B.x - A.x;
        double Yr = B.y - A.y;
        double Cos = Xr / (Math.hypot(Xr, Yr));
        double result=Cos*180/Math.PI;
        System.out.println("Angle»  " + result);
    }

    public boolean ontheline(int X, int Y) {
    	if((X-A.x)/(B.x-A.x)==(Y-A.y)/(B.y-A.y))
    	{
    		return true;
    	}
    	else
    	return false;
    }
   

    public void Dlina() {
        double Xr = B.x - A.x;
        double Yr = B.y - A.y;
        double dlina = Math.hypot(Xr, Yr);
        System.out.println("Length of the line  " + dlina);

    }

  

    }

    

