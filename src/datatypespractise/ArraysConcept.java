package datatypespractise;

import java.util.Arrays;

public class ArraysConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k[] = new int[4];
		int j;
		
		k[0] = 10;
		k[1] = 20;
		k[2] = 30;
		k[3] = 40;
		//to findout elemenst in  array 
		System.out.println(Arrays.toString(k));
		
		//for each loop ...incre/decre will takencare internally
		
		for(int l : k)
		{
			System.out.println(l);
			if(l==30)
			{
				System.out.println("bye");
				break;
			}
		}
		
		//below code is for just to check how while loop in for
//		for (int i =0; i < k.length; i++)
//		{
//			//System.out.println(k[i]);
//			
//			j = i;
//			while(j == 3)
//			{
//				
//			System.out.println("expected number is reached");
//			
//			j++;
//			
//			}
//			System.out.println(k[i]);
//			
//		}
//		
//		System.out.println("Size of Array = " + k.length);
		
		//array with cricket dATA
		
		Object player[] = new Object[5];
		player[0] ="Rahul";
		player[1] ="28";
		player[2] = "AFG";
		player[3] =5000;
		player[4] =110.22;
		
		System.out.println(Arrays.toString(player));
		
		Object player1[] = new Object[5];
		player1[0] ="Dhoni";
		player1[1] ="40";
		player1[2] = "IND";
		player1[3] =10000;
		player1[4] =190.22;
		
		System.out.println(Arrays.toString(player1));
		
		//char array
		
		char ch[] = new char[5];
		
		ch[0]='a';
		
		System.out.println(ch);
		

	}

}
