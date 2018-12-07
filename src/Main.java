import java.util.*;
public class Main {

	private static Scanner scanner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		scanner = new Scanner(System.in);
        int x=scanner.nextInt();
        int y=scanner.nextInt();
        Point point=new Point(x,y);
        point.show();
        System.out.println("Enter the number to add for X");
        int add=scanner.nextInt();
        point.add(add);
System.out.println("Enter the number to add for Y");
float add2=scanner.nextFloat();
        point.add(add2) ;
System.out.println("Enter the numbers to add for X and Y");
        float add1=scanner.nextFloat();
add=scanner.nextInt();
        point.add(add1,add);
        point.distance();
        System.out.println(" ");

        System.out.println("Введите‚ X1,Y1,X2,Y2");
        int X1=scanner.nextInt();
        int Y1=scanner.nextInt();
        int X2=scanner.nextInt();
        int Y2=scanner.nextInt();

        Point a=new Point(X1,Y1);
        Point b=new Point (X2,Y2);
        Line line =new Line(a,b);
        Line lineCoord=new Line(line.A.x,line.A.y,line.B.x,line.B.y);
        line.show(a,b);
        lineCoord.show(a,b);
        System.out.println("введите точку для проверки");
        int Xp=scanner.nextInt();
        int Yp=scanner.nextInt();
        if(line.ontheline(Xp, Yp)==true) System.out.println("Yes");
        else System.out.println("No");
        line.Dlina();
        line.Angle();


        int xc,yc;

        System.out.println("Enter coordinates of the new point");
        xc=scanner.nextInt();
        yc=scanner.nextInt();

        Point c=new Point(xc,yc);

        Krivaya krivaya =new Krivaya(a,b,c);

        krivaya.Angle();
///krivaya.showRewrite(a,b,c);

System.out.println("Enter point for check");

Xp=scanner.nextInt();
Yp=scanner.nextInt();

krivaya.ontheline(Xp,Yp);
krivaya.show(a, b);



    }
}
