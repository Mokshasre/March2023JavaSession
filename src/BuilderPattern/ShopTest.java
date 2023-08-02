package BuilderPattern;

public class ShopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//first flow
		Shopping shop = new  Shopping();
		shop.login("sravs@gmail.com", "srav123").search("Macbook pro").addToCart("Macbook pro")
		.doPayment("87879879@ybl").generateOrder().logout();
		
		//2 flow
		//we search diff product
		shop.login("sravs@gmail.com", "srav123").search("T shirt,1000").addToCart("T shirt")
        .logout();
		
		shop.login("sravs@gmail.com", "srav123").search("Apple Imac").search("Apple pro")
		.addToCart("Apple Imac")
        .logout();
		
		

	}

}
