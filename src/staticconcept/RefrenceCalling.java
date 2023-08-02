package staticconcept;

public class RefrenceCalling {
	
	public void sendEmail()
	{
		
		System.out.println("sending email");
	}

	public static void getEmail(RefrenceCalling userob)//classname n its obj ref
	{
		System.out.println("getting email");
		userob.sendEmail();//calling non static method with user refrence
		userob.test(20,userob);
		
		
	}
	public static void readEmail(RefrenceCalling userob)
	{
	
		System.out.println("reading email");
		userob.sendEmail();
		
		
	}
	public void test(int i,RefrenceCalling userob)
	{
		
		System.out.println(i);
		sendEmail();
		RefrenceCalling.readEmail(userob);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RefrenceCalling userobj = new  RefrenceCalling();
		RefrenceCalling.getEmail(userobj);
		readEmail(userobj);
		userobj.test(40,userobj);

	}

}
