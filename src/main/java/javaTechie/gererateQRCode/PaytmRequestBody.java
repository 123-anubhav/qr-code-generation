package javaTechie.gererateQRCode;

public class PaytmRequestBody {

	private String userName;
	private String accountType;
	private String accountNumber;
	private String mobileNumber;

	public PaytmRequestBody() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PaytmRequestBody(String userName, String accountType, String accountNumber, String mobileNumber) {
		super();
		this.userName = userName;
		this.accountType = accountType;
		this.accountNumber = accountNumber;
		this.mobileNumber = mobileNumber;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

}
