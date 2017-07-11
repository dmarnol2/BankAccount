package core;

public class BankAccount {
	String accountNumber;
	String accountHolder;
	double balance;     // without interest added
	int accountType;   // switch statement for type
	
	// initialize interest rate by type account in constructor by calling getInterestRate() ??
	
	public BankAccount() {
		this.accountNumber = "none";
		this.accountHolder = "Unknown";
		this.balance = 0;
		this.accountType = 0;
	}
	
		public BankAccount(String accountNumber, String accountHolder, double balance, int accountType) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
		this.accountType = accountType;
	}

		public String getAccountNumber() {
			return accountNumber;
		}

		public void setAccountNumber(String accountNumber) {
			this.accountNumber = accountNumber;
		}

		public String getAccountHolder() {
			return accountHolder;
		}

		public void setAccountHolder(String accountHolder) {
			this.accountHolder = accountHolder;
		}

		public double getBalance() {
			return balance;
		}

		public void setBalance(double balance) {
			this.balance = balance;
		}

		public int getAccountType() {
			return accountType;
		}

		public void setAccountType(int accountType) {
			this.accountType = accountType;
		}
		public double calculateTotalBalance(double bal, double intRate){
			double totalBalance;
			totalBalance=balance+(bal*intRate/100);   // maybe here use getInterestRate() instead of as parameter
			return totalBalance;
			
		}
		
		// use switch statement for types of rate
		public double getInterestRate(int acctType){
			double rate = 0;
			return rate;
			
		}
}
