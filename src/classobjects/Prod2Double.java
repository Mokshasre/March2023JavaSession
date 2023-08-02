package classobjects;

public class Prod2Double {
	

	public double product(double x,double y)
	{
		double prod = x*y;
		return prod;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Prod2Double p = new Prod2Double();
		
		double prodt = p.product(12, 25);
		
		System.out.println("Product of 2 numbers are " + prodt);
		
		
		

	}

}
