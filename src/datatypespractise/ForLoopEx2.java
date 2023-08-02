package datatypespractise;

import java.util.Arrays;

public class ForLoopEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//employee data - String,int,double,char,boolean
		
		//in object array we can use different datatypes of data
		//object is class - non-primitive data type
		
		Object emp[] = new Object[5];
		
		emp[0] = "Tom";
		emp[1] = "25";
		emp[2] = 12.33;
		emp[3] = 'm';
		emp[4] = true;
		System.out.println("length of array emp : " + emp.length);
		
		for(Object e:emp)
		{
			System.out.println(e);
		}
		
		//to use concept of indexing
		System.out.println("-------use concept of indexing......");
		int count =0;
		for(Object e:emp)
		{
			System.out.println(count +" =" + e);
			count++;
		}
		
		//reverse print
		System.out.println("--------reverse of elements......");
		
		for(int j = emp.length-1;j>=0;j--)
		{
			System.out.println(emp[j]);
		}

	}

}
