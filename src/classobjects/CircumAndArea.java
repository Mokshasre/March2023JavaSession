package classobjects;

public class CircumAndArea {
	
	//int r = 5;
	
	public double circum(int r)
	{
		float pi = 3.142f;
		double cir = 2*pi*r;
		return cir;
		
	}
	
	public double area(int r)
	{
		double pi = 3.142;
		double area = pi*r*r;
		return area;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircumAndArea ca = new CircumAndArea();
		
		double circum = ca.circum(5);
		double ar = ca.area(5);
		
		System.out.println("Circumferernce of circle is "+ circum);
		System.out.println("Area of circle is "+ ar);
		
	}

}
