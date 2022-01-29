package bank;

class Account {
	int amt;
	int balance;
	String name;
	String msg;
	String text = "weer";

	void checkBalance(String msg, int amt) {
		System.out.println(msg + " is " + amt + text);
		System.out.println("Balance is " + balance);
	}

	void withdrow(String msg, int amt) {
		balance -= amt;
		System.out.println(msg + " is " + amt);
	}
}