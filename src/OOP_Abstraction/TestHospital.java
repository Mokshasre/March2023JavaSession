package OOP_Abstraction;

public class TestHospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FortisHospital fh = new FortisHospital();
		fh.physioServices();
		fh.cardioServices();
		fh.neuroServices();
		fh.emergencyServices();
		fh.dentalServices();
		fh.medicalInsurance();
		fh.medicalTraining();
		
		System.out.println(USMedical.min_fee);
		System.out.println(FortisHospital.min_fee);
		
		USMedical.USMedPharmacy();//static method
		
		fh.billing();//default method is given as an copy
		//USMedical u = new USMedical();cant create the object for interface
		
		//FortisHospital.min_fee = 100;
		//Topcasting 
		System.out.println("---------top casting US......");
		USMedical us = new FortisHospital();//this is possible
		
		us.physioServices();
		us.ENTServices();
		us.cardioServices();
		
		us.emergencyServices();//common method
		
		System.out.println("---------top casting UK......");
		UKMedical uk = new FortisHospital();
		
		uk.neuroServices();
		uk.orthoServices();
		uk.emergencyServices();
		
		System.out.println("---------top casting IM......");
		IndianMedical im = new FortisHospital();
		
		im.dentalServices();
		im.gynoServices();
		im.emergencyServices();

		
		//downcasting not possible
		//FortisHospital f = new USMedical();
		

	}

}
