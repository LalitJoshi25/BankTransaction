package bank_Main;

import bank_subClass.*;
import java.util.*;

@SuppressWarnings("serial")
public class BankMainClass extends Exception {
	public BankMainClass(String msg) {
		super(msg);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner s = new Scanner(System.in);) {
			try {
				System.out.println("Enter Pin");
				int pin = s.nextInt();
				CheckPin_No ccp = new CheckPin_No();
				ccp.verify(pin);
				System.out.println("Enter your Choice\n1.Withdraw\n2.Deposit");
				int choice = s.nextInt();

				switch (choice) {
				case 1:
					System.out.println("================================");
					System.out.println("Enter amount");
					int a1 = s.nextInt();
					if (!(a1 > 0 && a1 % 100 == 0)) {
						BankMainClass ob2 = new BankMainClass("Invalid Amount");
						throw ob2;
					}
					Withdraw wd = new Withdraw();
					wd.process(a1);
					System.out.println("================================");
					break;
				case 2:
					System.out.println("================================");
					System.out.println("Enter amount");
					int a2 = s.nextInt();
					if (!(a2 > 0 && a2 % 100 == 0)) {
						BankMainClass ob23 = new BankMainClass("Invalid Amount");
						throw ob23;
					}
					Deposit d = new Deposit();
					d.process(a2);
					System.out.println("================================");
					break;
				default:
					System.out.println("================================");
					BankMainClass bmc = new BankMainClass("Invalid Choice!!!");
					System.out.println("================================");
					throw bmc;
				}

			} catch (CheckPin_No | Withdraw | BankMainClass e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
