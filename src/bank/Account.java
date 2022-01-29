package bank;

class Account {
	int amt;
	int balance;
	String name;
	String msg;
	String text = "weer";

	void checkBalance(String msg, int amt) {
		System.out.println(name + ": " + msg + " is " + balance );
		//System.out.println("Balance is " + balance);
	}

	void withdrow(String msg, int amt) {
		balance -= amt;
		System.out.println(name + ": " +  msg + " is " + amt);
	}
}