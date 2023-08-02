package OOP_Encapsulation;

public class EmpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee();
		e1.setName("Srav");
		e1.setAge(45);
		e1.setSalary(13.45);
		System.out.println(e1.getName());
		System.out.println(e1.getAge());
		System.out.println(e1.getSalary());
		
		System.out.println(e1.getAmount());
		
		System.out.println("-----------------------");

		LoginPage lp = new LoginPage();
		lp.setUsername("admin@gmail.com");
		lp.setPassword("ab12345");
		
		System.out.println(lp.getUsername());
		System.out.println(lp.getPassword());
		

		
		

	}

}
