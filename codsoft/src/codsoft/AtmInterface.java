package codsoft;
public class AtmInterface {
	 public static void main(String[] args) {
	     BankAccount account = new BankAccount(1000.0); // Initial balance
	     ATM atm = new ATM(account);
	     atm.execute();
	 }
	}
