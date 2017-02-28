package me.xzl.testSynchronized;

public class AddMoneyThread1 implements Runnable {

	private Account1 account;//存入账户
	private double money;//存入金额
	
	public AddMoneyThread1(Account1 account,double money) {
		this.account = account;
		this.money = money;
	}
	@Override
	public void run() {
		synchronized(account){
			account.deposit(money);
		}
	}

}
