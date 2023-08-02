package OOP_Abstraction;

public interface USMedical extends WHO,UN {
	//method has no body
	//only methoid declaration
	
	int min_fee =10;
	//vars are static and final by default
	
	public void physioServices();
		
	public void cardioServices();
	public void ENTServices();
	public void emergencyServices();
	
	public void test(int a);
	public String get(int a);
	public String get(int a,int b);
	@Override
	public void covidVaccination();
	
	
	//JDK 1.8 from
	
	public static void USMedPharmacy()
	{
		System.out.println("US...MEDPharmacy");
	}
	public static void USMedPharmacy(int a)
	{
		System.out.println("US...MEDPharmacyoverload");
	}
	default void billing()
	{
		System.out.println("US....billing default method");
	}
	
	default void billing(int a)
	{
		System.out.println("US....billing default method-overload ");
	}
	


}
