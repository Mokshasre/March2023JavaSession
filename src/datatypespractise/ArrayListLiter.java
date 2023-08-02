package datatypespractise;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListLiter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> browserList = new ArrayList<String>(Arrays.asList("chrome","firefox","edge"));
		
		System.out.println(browserList);
		
		System.out.println(browserList.size());
		
		System.out.println(browserList.get(2));
		
		for(String e:browserList)
		{
			
			System.out.println(e);
		}
		
		//To reverse teh elements
		ArrayList<String> empList = new ArrayList<String>(Arrays.asList("Tom","peter","Ravi","Shubam","Sagar"));
		
		Collections.reverse(empList);
		
		System.out.println(empList);
		
		//TO Reverse teh String usng for Loop
		
		for (int i = empList.size()-1; i>=0; i--)
		{
			System.out.println(empList.get(i));
		}
		//Static Array to ArrayList
		
		Integer num[] = {12,34,55,11,22,33};//here we need to declare as Integer
		//array to aarlist
		//int i = Arrays.asList(num).size();
		
		List<Integer> numList =	Arrays.asList(num);
		
		System.out.println(numList.size());//output is static arrays i.e 1 not the array values
		
		//String Static array to Arralylist
		
		String browser[] = {"chrome","firefox","edge"};
		
	List<String> browserNameList =	Arrays.asList(browser);
	System.out.println(browserNameList.size());
	
	//This is ArrayList not ArraylistLiterals
	ArrayList<String> list = new ArrayList<String>() {
		{
		
		add("java");
		add("python");
		add("Ruby");
		}
		
	};
		System.out.println(list.size());
		list.add("c#");
		System.out.println(list.size());
	
//Immutable list
		//List is INterface
		//Since it gives you the integers we are storing in Integer
		List<Integer> nList = List.of(1,2,3,4,5);//it gives of list of elements and size is fixed i.r immutable
		
		System.out.println(nList.size());
		//nList.add(6);
		
		//System.out.println(nList.size());//we get error
		//nList.remove(1);
		//System.out.println(nList.size());/we get error
		
		
		ArrayList<String> monthsList = new ArrayList<String>();//vc=10,pc=0
		
		monthsList.add("Jan");
		monthsList.add("Feb");
		monthsList.add("March");
		//here VC=7,Pc=3
		monthsList.add("April");
		monthsList.add("May");
		monthsList.add("June");
		
		monthsList.trimToSize();//trim the VC to current PC ..now vc=3 ;pc=3
		
		monthsList.add(0, "Month");
		monthsList.add("July");
		
		//monthsList.add(10,"July");//error IOE skipping some elements 
		
		System.out.println(monthsList);
		//swap 0 and 1 index values
		Collections.swap(monthsList, 0, 1);
		System.out.println(monthsList);
		
		Collections.reverse(monthsList);
		System.out.println(monthsList);
		System.out.println("...Sorting..............");
		Collections.sort(monthsList);//It will sort in ascending order
		System.out.println(monthsList);
		
		//to print in descending order
		System.out.println("..Descending order.........");
		Collections.reverse(monthsList);
		System.out.println(monthsList);
		
		List<Object> ls = Collections.emptyList();
		System.out.println(ls.size());//o/p is zero
		
		//Add a value in middle of list
		
		ArrayList<Integer>  ll = new ArrayList<Integer>();
		ll.add(1);//0
		ll.add(2);//1
		ll.add(3);//2
		ll.add(4);//3
		ll.add(5);//4
		ll.add(6);//5
		ll.add(7);//6
		
		System.out.println(ll);
		
		int mid = ll.size()/2;//6/2=3
		
		System.out.println(mid);
		
		int j = ll.get(mid);//4 value
		//System.out.println(j);
		
		ll.add(mid+1, 22);
		
		System.out.println(ll);
		
		
		
				

	}

}
