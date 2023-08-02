package classobjects;

public class MaxAndMin {
	
	public int maxNumber(int a,int b,int c)
	{
		//int max = 0;
		
		if (a >= b && a >= c)
			return a;
	         //System.out.println( a + " is the maximum number.");
	      else if (b >= a && b >= c)
	    	  return b;
	         //System.out.println( b + " is the maximum number.");
	      else
	    	  return c;
	         //System.out.println( c + " is the maximum number.");
		
		//return max;
		
	}
    public int minNumber(int a,int b,int c){
    	if (a <= b && a <= c)
    		return a;
	         //System.out.println( a + " is the Minimum number.");
	      else if (b <= a && b <= c)
	    	  return b;
	         //System.out.println( b + " is the Minimum number.");
	      else
	    	  return c;
	         //System.out.println( c + " is the Minimum number.");
    	
    	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MaxAndMin val = new MaxAndMin();
		
		 int maxno =val.maxNumber(45,120,3);
		 int minno =val.minNumber(78, 89, -1);
		
		System.out.println("Maximum number is " + maxno);
		System.out.println("Minumum number is " + minno);

	}

}
