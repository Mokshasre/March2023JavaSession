package classobjects;

public class MarksGrades {
	
	public void gradesList(int marks)
	{
		if(marks >= 91 && marks<=100)
		{
			
			System.out.println("Person get the Grade : AA");
		}
		else if(marks >= 81 && marks<=90)
		{
			System.out.println("Person get the Grade : AB");
		}
		else if(marks >= 71 && marks<=80)
		{
			System.out.println("Person get the Grade : BB");
		}
		else if(marks >= 61 && marks<=70)
		{
			System.out.println("Person get the Grade : BC");
		}
		else if(marks >= 51 && marks<=60)
		{
			System.out.println("Person get the Grade : CD");
		}
		else if(marks >= 41 && marks<=50)
		{
			System.out.println("Person get the Grade : DD");
		}
		else 
		{
			System.out.println("Person get the marks < 40 : FAIL");
		}
			
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarksGrades gl = new MarksGrades();
		gl.gradesList(78);
		
		
	}

}
