package List4;

public class BankAccountInfo {
	UserBankAccount userInfo = new UserBankAccount();
	
	public void setWithdrawal(double value) {
		userInfo.balance = value;
	}
	public double getWithdrawal() {
		return userInfo.balance ;
	}
	
	
	public void setName(String value) {
		userInfo.name = value;
	}
	public String getName() {
		return userInfo.name;
	}
	
	
	public void setNumber(int value) {
		userInfo.balance = value;
	}
	public int getNumber() {
		return userInfo.number ;
	}
	
	
	public void setBankBranch(String value) {
		userInfo.bankBranch = value;
	}
	public String getBankBranch() {
		return userInfo.bankBranch ;
	}
	
	
	public void setDate(int day,int month,int year) {
		userInfo.openingDate.day = day;
		userInfo.openingDate.month = month;
		userInfo.openingDate.year = year;
	}
	public Date getDate() {
		return userInfo.openingDate ;
	}
	
	public void withdrawal(double withdrawalValue) {
		userInfo.balance = userInfo.balance-withdrawalValue;
		System.out.print("\nsaldo : "+ userInfo.balance);
	}
	
	public void deposit(double depositValue) {
		userInfo.balance = userInfo.balance+depositValue;
		System.out.print("\nsaldo : "+ userInfo.balance);
	}
	
	public void calculationIncome() {
		System.out.print("\nRendimento:"+userInfo.balance*0.1);
	}
	public void showBankAccountInfo() {
		System.out.print("\nNome:"+userInfo.name);
		System.out.print("\nNumero:"+userInfo.number);
		System.out.print("\nAgencia:"+userInfo.bankBranch);
		System.out.print("\nSaldo:"+userInfo.balance);
		System.out.print("\nData:"  );
		userInfo.openingDate.showDate();
	}
	
}
