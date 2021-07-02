package factory;

public class Account {
	private String accountName;
	private int serialNo;
	public Account getAccountName;
	
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getAccountName() {
		return accountName;
	}
	public int getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}
	@Override
	public String toString() {
		return "Account [accountName=" + accountName + ", serialNo=" + serialNo + "]";
	}
	
		
	
	
	
}
