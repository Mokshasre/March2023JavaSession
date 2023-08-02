package classobjects;

public class VoteProg {
	
	public boolean checkVoting(int age)
	{
		boolean flag = true;
		if (age >= 18) {
			//System.out.println("You are eligible for voting.");
			return true;
		} else {
			//int diff = (18 - age);
			//System.out.println("Sorry,You can vote after: " + diff + " years");
			return false;
		}
		//return flag;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VoteProg v = new VoteProg();
		boolean resu = v.checkVoting(10);
		System.out.println(resu);

	}

}
