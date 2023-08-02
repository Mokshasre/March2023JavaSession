package datatypespractise;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			ArrayList ar = new ArrayList();
			
			ar.add(100);
			ar.add(200);
			ar.add(300);
			ar.add(400);
			
			System.out.println(ar.toString());
			ar.add(500);
			
			ar.add(600);
			
			System.out.println(ar.size());
			
			System.out.println(ar.toString());
			
			System.out.println(ar.get(3));
			
			//Add some colors String type
			
			ArrayList<String> col = new ArrayList<String>();
			
			col.add("Red");
			col.add("Yellow");
			col.add("Blue");
			col.add("Violet");
			col.add("Green");
			//below line output gives you the entire array in line
			//System.out.println(col.toString());
			//get 4th Index
			//System.out.println(col.get(4));
			
			//below loop gives you the output line by line 
			for(int i =0; i< col.size(); i++)
			{
				System.out.println(col.get(i));
			}
			//updated index 1 with Peach means replaced
			col.set(1, "Peach");
			System.out.println(col.toString());
			
			col.add(0, "Brown");
			System.out.println(col.toString());
			
			col.remove(5);
			System.out.println("Current values are " + col.toString());
			//size is 5 now but till 4th index
			System.out.println(col.size());
			
			//Java program to search an element in an array list using for loop. Once we find that element, break the loop.
//			for(String e : col)
//			{
//				System.out.println(e);
//				if(e.equals("Peach"))
//				{
//					System.out.println("expected color is found");
//					break;
//				}
//			
//				
//			}
			//int k[];
			for(int i =0 ; i<col.size(); i++)
			{
				System.out.println(col.get(i));
				if(col.get(i)== "Peach")
				{
					System.out.println("expected color is found");
					break;
				}
				
			}
			
			//System.out.println("Current values are " + col.toString());

	}

}
