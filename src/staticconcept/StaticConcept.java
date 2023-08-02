package staticconcept;

public class StaticConcept {
	
	//instance var
	String name;
	static int age;
	public void getEmail()
	{
		System.out.println("get email method");
	}
	
	public static void sendEmail()
	{
		System.out.println("send email method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticConcept obj = new StaticConcept();
		obj.name = "kav";
		StaticConcept.age = 12;//static var with classname calling is bestway
		age = 15;//withinclass directly also can called
		//obj.age; // this is not all best way n gives warning since its not in object
		System.out.println(StaticConcept.age);
		obj.getEmail();
		sendEmail();
		//StaticConcept.sendEmail(); //--this is best way

	}

}
