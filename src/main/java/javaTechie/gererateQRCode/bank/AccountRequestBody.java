package javaTechie.gererateQRCode.bank;

public class AccountRequestBody {

	private String userName;
	private String bankAddress;
	private String ifscCode;
	private String accountNumber;
	private String accountHolderName;
	private String userId;
	private String branch;
	private String upiId;

	
	public String getUpiId() {
		return upiId;
	}

	public void setUpiId(String upiId) {
		this.upiId = upiId;
	}

	public AccountRequestBody() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AccountRequestBody(String userName, String bankAddress, String ifscCode, String accountNumber,
			String accountHolderName, String userId, String branch, String upiId) {
		super();
		this.userName = userName;
		this.bankAddress = bankAddress;
		this.ifscCode = ifscCode;
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.userId = userId;
		this.branch = branch;
		this.upiId = upiId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getBankAddress() {
		return bankAddress;
	}

	public void setBankAddress(String bankAddress) {
		this.bankAddress = bankAddress;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

}
