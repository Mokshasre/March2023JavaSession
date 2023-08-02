package OOP_Encapsulation;

public class BankAccount {
	
	private String accountNumber;
	private double balance;
	private String owner;
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public double deposit(double amount)
	
	{
		//int depamt = 5000;
		this.balance  = balance + amount;
		return balance;
		
	}
	
	public double withdraw(double amount)
	
	{
		//int withdamt = 1000;
		this.balance = balance - amount;
		return balance;
	
	}
	
	public void printStatement(String accountNumber,double balance,String owner)
	{
		System.out.println("accountNumber is " +  accountNumber );
		System.out.println("balance is " +  balance );
		System.out.println("owner is " +  owner );
	}
	
	public static void main(String[] args) {
	
		
		BankAccount obj  = new BankAccount();
		obj.setAccountNumber("ABC45688");
		obj.setBalance(40000);
		obj.setOwner("Raju");
		System.out.println(obj.deposit(obj.getBalance()));
		
		System.out.println(obj.withdraw(20000));
		
		obj.printStatement(obj.getAccountNumber(), obj.balance, obj.owner);
		
		
		
	}

}
