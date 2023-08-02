package classobjects;

public class Student {
	
	String name;
	int marks;
	char grade;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student st = new Student();
		
		st.name = "sravs";
		st.marks = 89;
		st.grade = 'A';
		

		Student st1 = new Student();
		
		//st1 = null;
		st1.name = "padma";
		st1.marks = 78;
		st1.grade = 'B';
		
		
		System.out.println(st.name + " " + st.marks + " " + st.grade);
		
		System.out.println(st1.name + " " + st1.marks + " " + st1.grade);
		
		
	}

}
