package staticconcept;

public class StaticCon2 {
	
	//what is practical ex of static varaibles
	String name;
	String engineNumber;
	String chasisNumber;
	double price;
	 static int wheels = 4; //since its common so now it takes only 4 bytes for int 
	//wheels property is common for all cars ...so t it will create CMA in static no need to call always with obj refernce
	//utlits//generic fun
	 
	 public static void displayLogo() {
		 
		 
	 }
	 //non static
 public  void getUrl() {
		 
		 
	 }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i =10;//local var
		
		StaticCon2 carobj = new StaticCon2();
		carobj.name = "Audi.A6";
	    carobj.chasisNumber ="AEBNDHJM12";
	    //carobj.wheels= 4; // in these case everytime the obj creatation ncalling it will take 4 bytes
	    	
	    StaticCon2 carobj1 = new StaticCon2();
	    carobj1.name = "Audi.A12";
	    carobj1.chasisNumber ="yuVGDH67";
	    //carobj1.wheels= 4;
	    
	    StaticCon2 carobj2 = new StaticCon2();
	    carobj2.name = "BMW";
		carobj2.chasisNumber ="MNFGTAH78";
		//carobj2.wheels= 4;
		
		System.out.println(carobj.name + " " + carobj.chasisNumber + " " + carobj.wheels);

	}

}
