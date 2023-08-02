package datatypespractise;

public class IncrementDecrementQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=11, b=22, c;
		
		c = a + b + a++ + b++ + ++a + ++b;
		
		System.out.println( "a="+a);
		System.out.println( "b="+b);
		System.out.println( "c="+c);

	}

}
