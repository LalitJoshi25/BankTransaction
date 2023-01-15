package bank_subClass;

@SuppressWarnings("serial")
public class Withdraw extends Exception implements Transaction{
	public Withdraw() {}
	public Withdraw(String msg) {
		super(msg);
	}
	public void process(int amt) throws Withdraw{
		try {
			if(amt>b.bal) {
				Withdraw w = new Withdraw("Insufficient Funds");
				throw w;
			}
			System.out.println("Amount Withdraw: "+amt);
			b.bal = b.bal - amt;
			b.getBalance();
			System.out.println("Transaction Completed!!!");
		}catch(Withdraw wd) {
			throw wd;
		}
	}
}
