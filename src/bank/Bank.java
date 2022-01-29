package bank;

public class Bank {

	public static void main(String args[]) {

		Account obj1 = new Account();
		Account obj2 = new Account();
		Account obj3 = new Account();
		Account obj4 = new Account();
		obj1.balance = 1000;
		obj1.name = "Alice";
		obj1.msg = "test";
		obj1.text = "ftre";
		obj2.balance = 2000;
		obj2.name = "William";		
		obj3.balance = 5000;
		obj3.name = "Cadence";
		obj4.balance = 9000;
		obj4.name = "Jo";
		obj4.balance = 12000;
		obj4.name = "Marc";
		obj1.withdrow("Withdrow", 100);
		obj1.checkBalance("Balance", 100);
		obj2.withdrow("Withdrow", 100);
		obj2.checkBalance("Balance", 10);
		obj3.withdrow("Withdrow", 100);
		obj3.checkBalance("Balance", 10);
		obj4.withdrow("Withdrow", 100);
		obj4.checkBalance("Balance", 10);

		System.out.println("End");
	}
}
