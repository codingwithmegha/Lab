package Lab_5_2_march;
public class customer {
private int accountNumber;   //instance variable
private String accountName;  //instance variable
private double accountBalance;   //instance variable
void accnumber() {
System.out.println("Add Account_Number");	
}
void accname() {
	System.out.println("Add Account_Name");
	}
void accbal() {
	System.out.println("Add Account_Balance");
}
public int getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(int accountNumber) {
	this.accountNumber = accountNumber;
}
public String getAccountName() {
	return accountName;
}
public void setAccountName(String accountName) {
	this.accountName = accountName;
}
public double getAccountBalance() {
	return accountBalance;
}
public void setAccountBalance(double accountBalance) {
	this.accountBalance = accountBalance;
}
public static void main(String[] args) {   //main method
	customer c=new customer();  //object
	c.accnumber();
    c.accname();
    c.accbal();
	c.setAccountNumber(267327467);   //setting value in account_number
	c.setAccountName("Anuj Kumar");   //setting value in account_name
	c.setAccountBalance(50000);   //setting value in account_balance
	System.out.println("Account_Number is: "+c.getAccountNumber());   //getting the value of account_number
	System.out.println("Account_Name is: "+c.getAccountName());   //getting the value of account_name
	System.out.println("Account_Balance is :"+c.getAccountBalance());   //getting the value of account_balance
    
}
}
