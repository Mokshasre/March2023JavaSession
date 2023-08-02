package datatypespractise;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String Env = "Dev";
//		
//		switch (Env) {
//		case "QA":
//
//			System.out.println("Launch QA Env");
//
//			break;
//		case "Stage":
//
//			System.out.println("Launch Stage Env");
//
//			break;
//		case "Dev":
//
//			System.out.println("Launch Dev Env");
//
//			break;
//		case "UAT":
//
//			System.out.println("Launch UAT Env");
//
//			break;
//		case "Prod":
//
//			System.out.println("Launch Prod Env");
//
//			break;
//
//		default:
//			
//			System.out.println("Please mention correct Env");
//			break;
//		}
		
		//-----------------------------------------------
		
//	String carType = "Mini";
//		
//		switch (carType) {
//		case "Mini":
//
//			System.out.println("Show the cars of " + carType);
//
//			
//		case "SUV":
//
//			System.out.println("Show the cars of " + carType);
//
//			break;
//		case "Sedan":
//
//			System.out.println("Show the cars of " + carType);
//
//			break;
//		case "XUV":
//
//			System.out.println("Show the cars of " + carType);
//
//			break;
//		case "Tesla":
//
//			System.out.println("Show the cars of " + carType);
//
//			break;
//
//		default:
//			
//			System.out.println("print please select the right car type");
//			break;
//		}
		//----------------------------------------
		
String loanType = "HouseLoan";
int userSal = 45000;
		
		switch (loanType) {
		case "CarLoan":

			System.out.println("Show the details of " + loanType);
 break;
			
		case "HouseLoan":

			System.out.println("Show the details of " + loanType);
			if(userSal < 35000)
			{
				System.out.println("Not Applicable for Housing loan");
			}
			else
				System.out.println("Applicable for Housing loan");

			break;
		case "PersonalLoan":

			System.out.println("Show the details of " + loanType);

			break;
		case "EducationalLoan":

			System.out.println("Show the details of " + loanType);

			break;


		default:
			
			System.out.println("print please select the right loan type");
			break;
		}

	}

}
