package classobjects;

public class User {
	
	String name;
	int age;
	String city;
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User u1 = new User();
		
		u1.name = "Rinku";
		u1.age = 30;
		u1.city = "Pune";
		
	User u2 = new User();
		
		u2.name = "Sapna";
		u2.age = 29;
		u2.city = "Bangalore";
		
	User u3 = new User();
		
		u3.name = "Azmon";
		u3.age = 40;
		u3.city = "UP";
		
User u4 = new User();
		
		u4.name = "Kiran";
		u4.age = 45;
		u4.city = "AP";
		
		
//		System.out.println(u1.name + " " + u1.age +" " + u1.city);
//		System.out.println(u2.name + " " + u2.age +" " + u2.city);
//		System.out.println(u3.name + " " + u3.age +" " + u3.city);
		
		//u2 values are assigned to u1
		u1=u2;
		
		System.out.println(u1.name + " " + u1.age +" " + u1.city);
		System.out.println(u2.name + " " + u2.age +" " + u2.city);
		System.out.println(u3.name + " " + u3.age +" " + u3.city);
		
		//o/p of above is sapna,sapna,Azmoon ...
		
		u2=u3;
		
		System.out.println(u1.name + " " + u1.age +" " + u1.city);
		System.out.println(u2.name + " " + u2.age +" " + u2.city);
		System.out.println(u3.name + " " + u3.age +" " + u3.city);
		
		// output of above is sapna azmon azmon
		
		u3=u1 ;
		
		//o/p of below is sapna...Azmon , sapna
		
		System.out.println(u1.name + " " + u1.age +" " + u1.city);
		System.out.println(u2.name + " " + u2.age +" " + u2.city);
		System.out.println(u3.name + " " + u3.age +" " + u3.city);
		
		u1 = u4;
		
		//o/p of below is kiran ..Azmon, sapna . Kiran
		
		System.out.println(u1.name + " " + u1.age +" " + u1.city);
		System.out.println(u2.name + " " + u2.age +" " + u2.city);
		System.out.println(u3.name + " " + u3.age +" " + u3.city);
		System.out.println(u4.name + " " + u4.age +" " + u4.city);
		
		u4 = u2;
		
		//o/p of below is kiran..Azmon , Sapna, Azmon
		
		System.out.println(u1.name + " " + u1.age +" " + u1.city);
		System.out.println(u2.name + " " + u2.age +" " + u2.city);
		System.out.println(u3.name + " " + u3.age +" " + u3.city);
		System.out.println(u4.name + " " + u4.age +" " + u4.city);
		
		u3=u4;
		
		System.out.println(u1.name + " " + u1.age +" " + u1.city);
		System.out.println(u2.name + " " + u2.age +" " + u2.city);
		System.out.println(u3.name + " " + u3.age +" " + u3.city);
		System.out.println(u4.name + " " + u4.age +" " + u4.city);
		
		

	}

}
