package encapsulationTypes;

class AA { 

//************************************************************
	private int amount;
	
	public void setAmount(int amount1) {
		this.amount = amount1;
	}
	
	public int getAmount() {
		return amount;
	}
//*************************************************************	
	private int bankNo;

	public void setBankNo(int bankNo1) {
		this.bankNo = bankNo1;
	}

	public int getBankNo() {
		return bankNo;
	}

//*************************************************************
	
	void executionn () {
		
		System.out.println(amount);
		System.out.println(bankNo);
	}
}
public class EncapsulationCase2 {

	public static void main(String[] args) {

		AA rr =  new AA();
	
		rr.setAmount(1729);
		rr.setBankNo(17291729);
		
		rr.executionn();
		
		
	
	}
}
