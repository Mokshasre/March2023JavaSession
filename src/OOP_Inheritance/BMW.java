package OOP_Inheritance;

public class BMW extends Car {
	

		@Override // method overriding this is not mandatory to write but explicitly we need to write
		public void start()
		{
			System.out.println("BMW-----Start");
		}
		//individual
		public void autoParking()
		{
			System.out.println("BMW-----autoParking");
		}
		@Override//this method is overrideen from grand parent - vehicle
		//it is overriden from CAR only i.e parent only not from vehicle
		public void engine()
		{
			System.out.println("BMW----turbo engine");
		}
	 //method hiding and can not be overridden but can be inherited
		public static void billing()
		{
			
			System.out.println("BMW billing ");
		}
		//private methods cannot be overridden its individual method
		private void testing()
		{
			System.out.println("BMW testing ");
			
		}
		
//		public final void power()
//		{
//			System.out.println("car-----power");
//		}

		private static  void test()
		{
			System.out.println("BMW testing ");
			
		}


}
