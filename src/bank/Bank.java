package bank;

public class Bank {

	public static void main(String args[]) {

		Account obj1 = new Account();
		Account obj2 = new Account();
		obj1.balance = 1000;
		obj1.name = "Alice";
		obj1.msg = "test";
		obj1.text = "ftre";
		obj2.balance = 2000;
		obj2.name = "Jo";
		obj4.balance = 9000;
		obj4.name = "William";
		obj1.withdrow("Withdrow", 100);
		obj1.checkBalance("Balance", 100);
		obj2.withdrow("Withdrow", 100);
		obj2.checkBalance("Balance", 10);
		obj4.withdrow("Withdrow", 100);
		obj4.checkBalance("Balance", 10);
		System.out.println("End");
	}
}
