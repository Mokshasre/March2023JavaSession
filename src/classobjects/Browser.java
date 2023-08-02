package classobjects;

import java.util.ArrayList;

public class Browser {
	
	public ArrayList<String> getEmployeeDevices(String empName)
	{
		System.out.println("getting the device list for : " + empName);
		empName = empName.trim().toLowerCase();
		
		ArrayList<String> devicesList = new ArrayList<String>();
		
		if(empName.equals("VINAYAK"))
		{
			devicesList.add("iphone 14");
			devicesList.add("Macbook pro");
			devicesList.add("Airtel Sim");
			devicesList.add("Apple Mouse");
					
		}
		else if(empName.equals("waseem"))
		{
			devicesList.add("samsung 14");
			devicesList.add("HP MOuse");
		}
		else if(empName.equals("prashanth"))
		{
			devicesList.add("Nokia 14");
			devicesList.add("headset pro");
			devicesList.add("Apple keyboard");
			devicesList.add("Apple Mouse");
			
		}
		else {
			System.out.println("Pass the right empname : employee is not found");
	}
		
		
		return devicesList;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Browser obj = new Browser();
		
		ArrayList<String> devlist = obj.getEmployeeDevices("vinayak");
		
		System.out.println(devlist);
		
		System.out.println("Total No: of devices : " + devlist.size());
		
		
		
		
		
	}

}
