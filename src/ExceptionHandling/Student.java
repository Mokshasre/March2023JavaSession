package ExceptionHandling;

public class Student {

	public static int getStudentMarks(String name) {
		
		System.out.println("getting marks for : " + name);
		
		if(name.equals("shubham"))
		{
			try {
				int i = 9/3;
				System.exit(0);//jvm will exit
				return 45;
				
			} catch (ArithmeticException e)
					 {
				// TODO: handle exception
				System.out.println("AE is coming");
				return 85;
			}
			finally {
			//return 100;
			}
		}
		else if(name.equals("sapna"))
		{
			return 90;
		}else {
			System.out.println("student not found......");
			return -1;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int m1 = Student.getStudentMarks("shubham");
   System.out.println(m1);
	}

}
