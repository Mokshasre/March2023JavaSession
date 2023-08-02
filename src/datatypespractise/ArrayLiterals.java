package datatypespractise;

import java.util.Arrays;

public class ArrayLiterals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//To remove 22 from Array
		int p[] = {1,4,5,2,3,22,31,2}; //size/length is 8
		
		int a[] = new int[p.length-1];
		
		int j =0;
		System.out.println("Length of p is " + p.length);
		System.out.println(Arrays.toString(p));
		
		for(int i= 0; i<p.length; i++)
		{
			
			if(p[i] != 22)
			{
				a[j] = p[i];
				
				j++;
			}
			
			//System.out.println(p.toString());
		}
		System.out.println(Arrays.toString(a));
		//System.out.println(a.length);
		//System.out.println(a.toString());

	}

}
