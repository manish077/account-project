package application;

public class Account {
	
	String firstName;
	String lastName;
	int accountNumber;
	
	public Account(String first, String second, int accountNo)
	{
		this.firstName =  first; 
		this.lastName = second;
		this.accountNumber = accountNo;
	}
	Account ()
	{
	}
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}
	@Override
	public String toString() {
		return "Account [firstName=" + firstName + ", lastName=" + lastName + ", accountNumber=" + accountNumber + "]";
	}
}
