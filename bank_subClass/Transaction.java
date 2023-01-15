package bank_subClass;

public interface Transaction {
	public static final Balance b = new Balance();
	public abstract void process(int amt) throws Withdraw;
}
