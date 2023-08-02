package OOP_Abstraction;

public class FortisHospital extends Medical implements USMedical,UKMedical,IndianMedical {
//USmedical methods
	@Override
	public void physioServices() {
		// TODO Auto-generated method stub
		System.out.println("FH--------physioServices");
		
	}

	@Override
	public void cardioServices() {
		// TODO Auto-generated method stub

		System.out.println("FH--------cardioServices");
		
		
	}

	@Override
	public void ENTServices() {
		// TODO Auto-generated method stub

		System.out.println("FH--------ENTServices");
		
	}
//UKMEdical methods
	@Override
	public void neuroServices() {
		// TODO Auto-generated method stub
		System.out.println("FH--------neuroServices");
		
		
	}

	@Override
	public void orthoServices() {
		// TODO Auto-generated method stub
		System.out.println("FH--------orthoServices");
		
	}
//india Interface
	@Override
	public void oncologyServices() {
		System.out.println("FH--------oncologyServices");
		
	}

	@Override
	public void dentalServices() {
		// TODO Auto-generated method stub
		System.out.println("FH--------dentalServices");
		
	}

	@Override
	public void gynoServices() {
		// TODO Auto-generated method stub
		System.out.println("FH--------gynoServices");
		
	}
	
	//FH -Indivial methods
	public void medicalTraining()
	{
		System.out.println("FH--------medicalTrainingINdivimethod");	
		
	}
	
	public void medicalInsurance()
	{
		System.out.println("FH--------medicalInsurance");	
		
	}
//comon method in all interfaces so only called once
	@Override
	public void emergencyServices() {
		// TODO Auto-generated method stub
		System.out.println("FH--------emergencyServices");
		
	}
//US medical methods with param
	@Override
	public void test(int a) {
		// TODO Auto-generated method stub
		
	}
//so here method overloading
	@Override
	public String get(int a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String get(int a, int b) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void covidVaccination() {
		// TODO Auto-generated method stub
		System.out.println("FH--------covidvaccination");
	}

	@Override
	public void medicalNews() {
		// TODO Auto-generated method stub
		System.out.println("FH--------medicalNews");
		
	}
	@Override
	public void billing()
	{
		
	}
	


}
