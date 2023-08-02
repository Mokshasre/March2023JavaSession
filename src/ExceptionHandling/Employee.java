package ExceptionHandling;

public class Employee {
String name;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
        try {
        	Employee e = new Employee();
        	//e=null;
        	System.out.println(e.name);
			int i  = 9/0;//immediately it will jump to catch n it wont come back if any exception in this code
			System.out.println("hello");
			System.out.println("hello");
		} catch (ArithmeticException  e) {
			// TODO: handle exception
			System.out.println("AE exception is Coming ..........");
			e.printStackTrace();
		}
        catch (NullPointerException  e) {
			// TODO: handle exception
			System.out.println("NPE exception is Coming ..........");
			e.printStackTrace();
		}
		
		System.out.println("bye");

	}

}
 