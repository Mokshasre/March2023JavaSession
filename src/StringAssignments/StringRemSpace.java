package StringAssignments;

public class StringRemSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test = "   Hello  Everyone  ";
		
		String res = test.trim();
		System.out.println(res);
		String res1 = res.replace("  ", "");
		System.out.println(res1);
		
		System.out.println("--------------------");
		//program that will  print out the last character and first character of a word.
		String str = "this is my java code";
		System.out.println(str.length());
		System.out.println("First character in str = " + str.charAt(0));
		System.out.println("Last character in str = " + str.charAt(19));
		System.out.println("--------------------");
		//program to verify a word or a character contained in the sentence.
		 if(res.contains("t"))
		 {
			 System.out.println("expected sentence is found");
		 }
		 else
		 {
			 System.out.println("not found");
		 }
		 
			 
			 
			 
		

	}

}
