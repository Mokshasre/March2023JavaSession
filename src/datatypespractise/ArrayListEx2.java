package datatypespractise;
import java.util.ArrayList;

public class ArrayListEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> arrlist=new ArrayList<String>();
		arrlist.add("Sunday");
		arrlist.add("Monday");
		arrlist.add("Tuesday");
		arrlist.add("Wednesday");
		arrlist.add("Thursday");
		arrlist.add("Friday");
		arrlist.add("Saturday");
		//By Index Position
		for(int i=0; i<arrlist.size(); i++)
		{
			System.out.println(arrlist.get(i));
		}
		
		//For each
		System.out.println("..foreach..........");
		for(String str:arrlist)
		{
			System.out.println(str);
		}

	}

}
