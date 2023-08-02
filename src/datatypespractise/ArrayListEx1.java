package datatypespractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> mL = new ArrayList<Integer>();

		mL.add(1);

		mL.add(2);

		mL.add(3);
		mL.add(4);

		mL.add(5);
		
		mL.remove(2);
		
		System.out.println(mL);

		ArrayList<String> studentNames = new ArrayList<String>();

		studentNames.add("Varun");

		studentNames.add("Reena");

		studentNames.add("Naveen");
		studentNames.add("Robin");

		studentNames.add("Peter");

		// Reverse this Array list

		studentNames.remove(1);
		System.out.println(studentNames.toString());

		studentNames.add(1, "Reena");
		System.out.println(studentNames.toString());
		// to get the sublist of elements
		List<String> sub_List = studentNames.subList(0, 3);

		System.out.println("List of first three elements: " + sub_List);

		System.out.println(studentNames.toString());

		Collections.reverse(studentNames);

		System.out.println(studentNames.toString());

		// other Hw
		ArrayList<Integer> marksList = new ArrayList<Integer>();

		marksList.add(5);

		marksList.add(6);

		marksList.add(3);
		marksList.add(2);

		marksList.add(4);

		System.out.println(marksList.toString());

		marksList.remove(2);
		System.out.println(marksList.toString());
		marksList.add(2, 3);

		System.out.println(marksList.toString());
		// BY using object we can remove the value
		marksList.remove((Object) 2);

		System.out.println(marksList.toString());
		System.out.println("emptied------------");

		marksList.removeAll(marksList);

		System.out.println(marksList.toString());

		marksList.add(0, 2);

		System.out.println(marksList.toString());

	}

}
