
public class Point {

	 public double x,y;
	 
	 
	  Point(double a, double b)
	    {
	        this.x=a;
	        this.y=b;
	    }
	 
	  
	  
	    public void show()
	    {
	        System.out.println("(x;y)"+"("+x+";"+y+")");
	    }
	    
	    
	    public void  add(int AddX)
	    {
	        x+=AddX;
	        System.out.println("Now X is "+ x);
	    }
	    
	    
	    public void  add(float AddY)
	    {
	        y+=AddY;
	        System.out.println("Now Y is "+ y);
	    }
	    
	    
	    public void add(float AddX,float AddY)
	    {
	        x+=AddX;
	        y+=AddY;
	        System.out.println(x+ "  "+y);

          }
	    public void distance()
	    {

	        double dist=Math.hypot((double)x,(double)y);
	        System.out.println(dist);

	    }
	  
	}