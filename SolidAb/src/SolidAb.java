import java.util.*;

abstract class solid {
	double radius;
	public abstract void surfacearea();
	public abstract void volume();
	public abstract void readradius();
	
	public double basearea(double r)
	{
		double p;
		p = Math.PI*r*r;
		return (p);
	}//end method
}//end abstract class

class cylinder extends solid{
	
	double height;
	
	public cylinder(double h)
	{
		height = h;
	}//end constructor
	
	public void readradius()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the radius of cylinder");
		double radius = s.nextDouble();
	}//end method readradius
	
	public void surfacearea()
	{
		double barea;
		double tarea;
		barea = basearea(radius);
		tarea = 2*(Math.PI*radius*height)+2*(barea);
		System.out.println("Total area of cylinder is --"+tarea);
	}//end method surface area
	
	public void volume()
	{
		System.out.println("Volume of cylinder is--"+ height*basearea(radius));
	}//end method volume
}//end class cylinder

class cone extends solid
{
	double height;
	
	public cone(double h)
	{
		height = h;
	}//end constructor
	
	public void readradius()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the radius of cone");
		double radius = s.nextDouble();
	}//end method readradius
	
	public void surfacearea()
	{
		double area;
		double sheight;
		sheight = Math.sqrt(radius*radius*height*height);
		area = (Math.PI*radius)*(radius+sheight);
		System.out.println("Surface area of cone is--"+area);
	}//end method surfacearea
	
	public void volume()
	{
		System.out.println("Volume of cone is--"+ (1.0/3)*height*basearea(radius));
	}//end method volume
}//end class cone

class sphere extends solid
{
	public void readradius()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the radius of sphere");
		double radius = s.nextDouble();
	}//end method readradius
	
	public void surfacearea()
	{
		System.out.println("Surface area of sphere is"+ 4*basearea(radius));
	}//end surface area method
	
	public void volume()
	{
		double volume;
		volume = (4.0/3)*radius*basearea(radius);
		System.out.println("Volume of cone is--"+volume);
	}//end method volume
}//end class sphere

public class SolidAb {
	public static void main(String args[])
	{
		solid s = new cylinder(7);
		s.readradius();
		s.surfacearea();
		s.volume();
		s = new cone(7);
		s.readradius();
		s.surfacearea();
		s.volume();
		s = new sphere();
		s.readradius();
		s.surfacearea();
		s.volume();
		
	}//end main

}//end class solid
