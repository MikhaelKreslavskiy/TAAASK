import static java.lang.Math.*;
public class Krivaya extends Line{

	Point C;
    public Krivaya(Point a,Point b,Point c)
    {
        super(a, b);
        C=c;
    }

    public void Angle()
    {
        double OneSideX = Math.pow((B.x-A.x),2);
        double OneSideY = pow((B.y - A.y), 2);
        double OneSide = sqrt(OneSideX+OneSideY);

        double SecondSideX = pow((C.x - B.x), 2);
        double SecondSideY = pow((B.y-C.y), 2);
        double SecondSide = sqrt(SecondSideX + SecondSideY);



      double Angle=Math.cos((OneSideX*SecondSideX+OneSideY*SecondSideY)/(OneSide*SecondSide));
      double ac=acos(Angle);
      double result=ac*180/PI;
      System.out.println("Angle  "+ result);



    }
    public boolean ontheline(int X, int Y)
    {
    	Line Al=new Line(A,B);
    	Line Bl=new Line(B,C);
    	if(Al.ontheline(X, Y)==Bl.ontheline(X, Y)) return true;
    	else return false;
    }
    public void show(Point A,Point B) {
    	  System.out.println("1st(x,y)  " + A.x + "  ;" + A.y);
          System.out.println("2nd(x,y)  " + B.x + "   ;" + B.y);
          System.out.println("3d (x,y   " + C.x   + "  ;"+ C.y  );
    }
   
    }

