package datatypespractise;

public class StringQuotesEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String userName = "Priya";
		//String xpath = "//a[text() ='"+userName+"']";
		
		//---to get output priya in doublequotes
		String userName = "\"Priya\"";
		
		String xpath = "//a[text() ="+userName+"]";
		System.out.println(xpath);

	}

}
