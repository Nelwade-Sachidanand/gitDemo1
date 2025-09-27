/*Bank Account Management (Collections + OOP)
👉 Problem Statement:
Create a program to manage multiple bank accounts using ArrayList.
Requirements:
Create a BankAccount class with:
accountNumber (int)
holderName (String)
balance (double)
In your Main class:
Add at least 5 accounts into an ArrayList<BankAccount>.
Implement the following:
Deposit → Increase balance of a given account
Withdraw → Decrease balance (only if enough funds)
Search → Find an account by account number
Print results at each step.
*/
package gitConnect1;

public class Task1_BankAccount {
	long AccoubtNumber;
	String holder_name;
	double salary;
	public Task1_BankAccount(long accoubtNumber, String holder_name, double salary) {
		AccoubtNumber = accoubtNumber;
		this.holder_name = holder_name;
		this.salary = salary;
	}
	public long getAccoubtNumber() {
		return AccoubtNumber;
	}
	public String getHolder_name() {
		return holder_name;
	}
	public double getSalary() {
		return salary;
	}
	
	public void setAccoubtNumber(long accoubtNumber) {
		AccoubtNumber = accoubtNumber;
	}
	public void setHolder_name(String holder_name) {
		this.holder_name = holder_name;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return " [AccoubtNumber=" + AccoubtNumber + ", holder_name=" + holder_name + ", salary=" + salary + "]";
	}
	

}
