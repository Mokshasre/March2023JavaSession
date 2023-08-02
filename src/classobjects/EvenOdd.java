package classobjects;

public class EvenOdd {
	
int e;	
	
public boolean evenoddmethod(int e)
{
boolean flag = true;
		if (e % 2 ==0)
		{
			
			//System.out.println(e + " is even number");
			//return true;
		}
	else 
		{
			System.out.println(e + " is odd number");
			return false;
		}
	
		//e++;
	
    return flag;
	
}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EvenOdd eo = new EvenOdd();
		boolean res = eo.evenoddmethod(22);
		System.out.println(res);

	}

}
