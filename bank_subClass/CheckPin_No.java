package bank_subClass;

@SuppressWarnings("serial")
public class CheckPin_No extends Exception{
	public CheckPin_No() {}
	public CheckPin_No(String msg) {
		super(msg);
	}
	public void verify(int pin) throws CheckPin_No{
		try {
			if(!(pin==111||pin==222||pin==333)) {
				CheckPin_No cp = new CheckPin_No("Invalid Pin");
				throw cp;
			}
		}catch(CheckPin_No cp) {
			throw cp;
		}
	}
}
