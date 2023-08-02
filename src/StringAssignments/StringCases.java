package StringAssignments;

public class StringCases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x = "100";
		//String to int
		int i = Integer.parseInt(x);
		
		System.out.println(i+20);
		//below gives error since its alphanumeric works for only numeric
//		String test = "100A";
//		int k = Integer.parseInt(test);
//		System.out.println(k);
		
		String s  = "12.33";
		
		Double d  = Double.parseDouble(s);
		System.out.println(d+10);

	}

}
